package com.aori.Kakao;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.aori.Utils.StringUtils.KAKAO_REDIRECT_URL;
import static com.aori.Utils.StringUtils.KAKAO_REST_API;

@Service
public class KakaoService {

    /**
     * 1. 카카오톡 로그인 API 토큰받기
     *
     * Request
     * curl -v -X POST "https://kauth.kakao.com/oauth/token" \
     *  -H "Content-Type: application/x-www-form-urlencoded" \
     *  -d "grant_type=authorization_code" \
     *  -d "client_id=${REST_API_KEY}" \
     *  --data-urlencode "redirect_uri=${REDIRECT_URI}" \
     *  -d "code=${AUTHORIZE_CODE}"
     *
     *
     * Response
     * {
     *     "token_type":"bearer",
     *     "access_token":"${ACCESS_TOKEN}",
     *     "expires_in":43199,
     *     "refresh_token":"${REFRESH_TOKEN}",
     *     "refresh_token_expires_in":25184000,
     *     "scope":"account_email profile"
     * }
     *
     * @return String ACCESS_TOKEN
     */
    public String getUserAuthorizationCode(String auth) {
        String openUrl = "https://kauth.kakao.com/oauth/token";
        String accessToken = "";

        try {
            URL url = new URL(openUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Method POST
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code")
              .append("&client_id=").append(KAKAO_REST_API)
              .append("&redirect_uri=").append(KAKAO_REDIRECT_URL)
              .append("&code=").append(auth);
            bw.write(sb.toString());
            bw.flush();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println("=====[ CONNECTION ERROR ]=====");
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }

            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            accessToken = element.getAsJsonObject().get("access_token").getAsString();

            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return accessToken;
    }
}
