package ex_25_ENUM;

public enum Env {
    DEV("https://dev.myapp.com"),
    STAGING("https://staging.myapp.com"),
    PROD("https://prod.myapp.com");
    private final String baseUrl;
    private String url;
    Env(String baseUrl) {
        this.baseUrl = baseUrl;
        this.url = url;
    }

    public String getUrl() {
        return baseUrl;
    }
}
