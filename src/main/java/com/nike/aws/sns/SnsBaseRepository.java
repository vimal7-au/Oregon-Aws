package com.nike.aws.sns;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSCredentialsProviderChain;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;

public class SnsBaseRepository {

    protected AmazonSNSClient amazonSNSClient;
    AWSCredentialsProvider awsCredentialsProvider;
    protected AWSCredentials awsCredentials;

    SnsBaseRepository() {
        awsCredentialsProvider = new AWSCredentialsProviderChain();
        AmazonSNSClientBuilder.standard().withRegion(Regions.US_WEST_2).setCredentials(awsCredentialsProvider);
    }

}
