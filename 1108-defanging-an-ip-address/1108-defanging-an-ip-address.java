class Solution {
    public String defangIPaddr(String address) {
        String repStr = address.replace(".", "[.]");
        return repStr;
    }
}