package session14.baitap;

public class ChuoiConTangDaiNhat {
    public String resolt(String s){

        String res ="";
        for(int i=0;i<s.length()-1;i++){
            String tem="";

            char k =s.charAt(i);
            tem+=k;
            for(int j=i;j<s.length();j++){
                if(k<s.charAt(j)){
                    k = s.charAt(j);
                    tem+=k;
                }
            }
            if(tem.length()>res.length()){
                res = tem;
            }

        }
        return res;
    }
}
