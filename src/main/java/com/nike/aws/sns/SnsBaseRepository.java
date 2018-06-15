package com.nike.aws.sns;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;

public class SnsBaseRepository {

    protected AmazonSNSClient amazonSNSClient;
    protected DefaultAWSCredentialsProviderChain defaultAWSCredentialsProviderChain;
    protected AWSCredentials awsCredentials;

    SnsBaseRepository() {
        defaultAWSCredentialsProviderChain = new DefaultAWSCredentialsProviderChain();
        awsCredentials = defaultAWSCredentialsProviderChain.getCredentials();
        amazonSNSClient.setRegion(Region.getRegion(Regions.US_WEST_2));
    }



}
