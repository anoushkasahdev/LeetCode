class Solution {
    public String numberToWords(int num) {
        
        if(num==0)
        return "Zero";

        String ones[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"
        ,"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen"
        ,"Eighteen","Nineteen"};

        String tens[]={"","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty",     "Ninety"};

        String thousands[]={"","Thousand","Million","Billion"};

        int groupIndex=0;

        StringBuilder result=new StringBuilder();

        while(num>0)
        {
             StringBuilder groupRes=new StringBuilder();

            if(num%1000!=0)
            {
               int part=num%1000;

               if(part>=100)
               {
                groupRes.append(ones[part/100]).append(" ").append("Hundred").append(" ");
                part=part%100;
               }

               if(part>=20)
               {
                groupRes.append(tens[part/10-1]).append(" ");
                part=part%10;
               }

               if(part>0)
               {
                groupRes.append(ones[part]).append(" ");
               }

               groupRes.append(thousands[groupIndex]).append(" ");
                
                //System.out.println(groupRes);
               
            }
                result.insert(0,groupRes);
               groupIndex++;
               num=num/1000;
        }

        return result.toString().trim();

        
    }
}