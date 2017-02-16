package ftp.client.FTPClient.service;

/**
 * Created by viscoze on 2/10/17.
 */

public final class FTPReply {
    private FTPReply() {}

    public static boolean isPositivePreliminary(int reply) {
        return (reply >= 100 && reply < 200);
    }

    public static boolean isPositiveCompletion(int reply) {
        return (reply >= 200 && reply < 300);
    }

    public static boolean isPositiveIntermediate(int reply) {
        return (reply >= 300 && reply < 400);
    }

    public static boolean isNegativeTransient(int reply) {
        return (reply >= 400 && reply < 500);
    }

    public static boolean isNegativePermanent(int reply) {
        return (reply >= 500 && reply < 600);
    }

    public static boolean isProtectedReplyCode(int reply) {
       return (reply >= 600 && reply < 700);
    }
}