package leo.bacherlorsthesis.agoratokenserver.service;

import leo.bacherlorsthesis.agoratokenserver.builders.RtcTokenBuilder;
import leo.bacherlorsthesis.agoratokenserver.domain.responses.TokenResponse;
import org.springframework.beans.factory.annotation.Value;

public class AgoraTokenServiceImpl implements AgoraTokenService {
    static int expirationTimeInSeconds = 3600;

    @Value("${applicationId}")
    private String appId;

    @Value("${applicationCertificate}")
    private String appCertificate;

    @Override
    public TokenResponse generateToken(int uid, String channel, boolean isPublisher) {
        TokenResponse tokenResponse = new TokenResponse();
        RtcTokenBuilder tokenBuilder = new RtcTokenBuilder();
        int timestamp = (int)(System.currentTimeMillis() / 1000 + expirationTimeInSeconds);

        String token = tokenBuilder.buildTokenWithUid(appId, appCertificate,
                channel, uid, RtcTokenBuilder.Role.Role_Publisher, timestamp);

        tokenResponse.setToken(token);
        tokenResponse.setUid(uid);
        return tokenResponse;
    }
}
