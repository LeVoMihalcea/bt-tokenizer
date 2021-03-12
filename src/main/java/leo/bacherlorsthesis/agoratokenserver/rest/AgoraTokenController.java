package leo.bacherlorsthesis.agoratokenserver.rest;

import leo.bacherlorsthesis.agoratokenserver.domain.requests.TokenRequest;
import leo.bacherlorsthesis.agoratokenserver.domain.responses.TokenResponse;
import leo.bacherlorsthesis.agoratokenserver.service.AgoraTokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agora/token")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AgoraTokenController {
    final
    AgoraTokenService agoraTokenService;

    Logger logger = LoggerFactory.getLogger(AgoraTokenController.class);

    public AgoraTokenController(AgoraTokenService agoraTokenService) {
        this.agoraTokenService = agoraTokenService;
    }

    @PostMapping
    public TokenResponse getToken(@RequestBody TokenRequest tokenRequest){
        logger.info("received getToken request: {}", tokenRequest);

        return agoraTokenService.generateToken(
                tokenRequest.getUid(),
                tokenRequest.getChannel(),
                tokenRequest.isPublisher()
        );
    }

}
