package leo.bacherlorsthesis.agoratokenserver.service;


import leo.bacherlorsthesis.agoratokenserver.domain.responses.TokenResponse;

public interface AgoraTokenService {
    public TokenResponse generateToken(int uid, String channel, boolean isPublisher);
}
