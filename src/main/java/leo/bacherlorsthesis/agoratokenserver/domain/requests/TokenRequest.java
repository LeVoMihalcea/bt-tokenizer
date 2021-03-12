package leo.bacherlorsthesis.agoratokenserver.domain.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class TokenRequest {
    private int uid;
    private String channel;
    private boolean isPublisher;
}
