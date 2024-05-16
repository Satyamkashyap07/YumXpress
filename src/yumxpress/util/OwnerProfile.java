/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.util;

/**
 *
 * @author sanja
 */
public class OwnerProfile {

    public static String getOwnerName() {
        return ownerName;
    }

    public static void setOwnerName(String ownerName) {
        OwnerProfile.ownerName = ownerName;
    }

    public static String getCompanyId() {
        return companyId;
    }

    public static void setCompanyId(String companyId) {
        OwnerProfile.companyId = companyId;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        OwnerProfile.companyName = companyName;
    }
    private static String ownerName;
    private static String companyId;
    private static String companyName;
}
