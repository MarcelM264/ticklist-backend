package tech.marmey.ticklist.constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 432_000_000;// 5 days expressed im ,milliseconds
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String TICKLIST_LLC = "Ticklist, GmbH";
    public static final String TICKLIST_ADMINISTRATION = "Ticklist App";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to log in to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = { "/user/login", "/user/register", "/user/resetpassword/**", "/user/image/**"};
    //Just for testing purposes
    //public static final String[] PUBLIC_URLS = { "**" };
}
