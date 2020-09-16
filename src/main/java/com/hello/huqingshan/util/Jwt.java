package com.hello.huqingshan.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Jwt {

    private static Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public static String generateJwt(String username){

        Map<String,String> claimsmap = new HashMap<>();
        claimsmap.put("username",username);

        LocalDateTime generatetime = LocalDateTime.now();
        LocalDateTime expirtime = generatetime.plusHours(1);

        Date date = Date.from(expirtime.toInstant(ZoneOffset.UTC));

        //setClaims疑似会覆盖setSub()
        String jwt = Jwts.builder().setClaims(claimsmap).setExpiration(date).signWith(key).compact();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年-MM月-dd号 hh:mm");
        String generatetimeformat = generatetime.format(dateTimeFormatter);
        String expritimeformat = expirtime.format(dateTimeFormatter);
        System.out.println("生成时间"+generatetimeformat);
        System.out.println("过期时间"+expritimeformat);

        return jwt;
    }

    public static Jws<Claims> parsingJwt(String token){
        try{
            return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
        }
        catch(Exception e){
            e.getMessage();
            return null;
        }
    }


}
