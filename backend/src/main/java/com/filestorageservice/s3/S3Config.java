package com.filestorageservice.s3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.regions.Region;

@Configuration
public class S3Config {

    @Value("${aws.region}")
    private String awsRegion;
    // Configure the S3 client with the desired region and endpoint
    @Bean
    public S3Client s3Client() {   
        S3Client client = S3Client.builder()
                .region(Region.of("awsRegion")) //configure the region from resources/application.yml
                .build();
        return client;
    }                    
}