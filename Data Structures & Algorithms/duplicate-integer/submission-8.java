class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int i = nums.length-1; 
        while(i>=0){
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
            i--;
        }
        return false;
    }
}
/*https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/bd6740d5a95a472f8c9c475139f7cd34.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/dc99cb37fa3f4245838bc71714c836a4.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/ae61ae67cba34dc58d2cfd42ff4e6563.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/5a0bc206f03b4be3958d761a50fe8967.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/9c1527ed500448d1a3295b166534cc65.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/eb0b6b5baadd45bd80a19aabe20e6ba9.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/7d7611d8ec3c48c28626b0e645e3b992.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/649059a3a2284b0e86e9c61b23192d5e.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/e8c5ff946102485896c952c1c6d509f2.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/6d588fbec6ea46b3bcfcccdc13c90539.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/98156e38f8ab439085b484811bfcbf5d.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/7760707168e8482e9f13eae42687d6a3.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/b51d8466e8d74849ba4832ad8bd68500.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/a6eca2abce974f2d854fa6d1bd039e9a.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/d7f31aa097ff4e77b52d4a275abfa4bb.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/8e74cacc95cb4264b75794fc29c0ce2e.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/43a8daa394eb421188ff4b64aea8d33c.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/70fc2e225b1f48a79db876827896398f.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/d17541eb63f7404ebcc5e82e2b36be9a.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/f18489fc9fda4de6b27bbe68e9847a09.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/e5b6a88221c642a69b66e4e695b542cc.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/fe72ef47ab0f4756bf4e6d1af083227f.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/07c2a3241a05432cad90bd2966ac9cc1.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/6782b0171c2244a59f8a1055ef5aabc5.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/9c678869d6eb42bdb5ea128f875d3a89.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/db4ad6b21dce414fa12aa458c2702893.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/b9fbceb5bb7b4d00894d7d3f04ff76b5.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/ca4db57c4658425f87efa0b938ad0219.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/2fce8e7353ad4461a256f129abb1a866.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/b38d788a95a849ea8bdb02f8e0461b66.html?version=cloud&locale=en-US
https://help.sap.com/docs/PRODUCTS/8e0d540f96474717bbf18df51e54e522/fbcabafe9d7f44608d7fc66b98885988.html?version=cloud&locale=en-US
*/