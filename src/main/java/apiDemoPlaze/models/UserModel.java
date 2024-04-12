package apiDemoPlaze.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @JsonProperty("username")
    public String username;

    @JsonProperty("password")
    public String password;
}
