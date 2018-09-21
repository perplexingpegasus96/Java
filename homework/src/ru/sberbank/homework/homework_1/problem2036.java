package ru.sberbank.homework.homework_1;

import java.util.Scanner;

public class problem2036 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] sarray = new String[n];
        String[] vowels = {"eee", "eey", "eeu", "eei", "eeo", "eea", "eye", "eyy", "eyu",
                "eyi", "eyo", "eya", "eue", "euy", "euu", "eui", "euo", "eua", "eie", "eiy",
                "eiu", "eii", "eio", "eia", "eoe", "eoy", "eou", "eoi", "eoo", "eoa", "eae",
                "eay", "eau", "eai", "eao", "eaa", "yee", "yey", "yeu", "yei", "yeo", "yea",
                "yye", "yyy", "yyu", "yyi", "yyo", "yya", "yue", "yuy", "yuu", "yui", "yuo",
                "yua", "yie", "yiy", "yiu", "yii", "yio", "yia", "yoe", "yoy", "you", "yoi",
                "yoo", "yoa", "yae", "yay", "yau", "yai", "yao", "yaa", "uee", "uey", "ueu",
                "uei", "ueo", "uea", "uye", "uyy", "uyu", "uyi", "uyo", "uya", "uue", "uuy",
                "uuu", "uui", "uuo", "uua", "uie", "uiy", "uiu", "uii", "uio", "uia", "uoe",
                "uoy", "uou", "uoi", "uoo", "uoa", "uae", "uay", "uau", "uai", "uao", "uaa",
                "iee", "iey", "ieu", "iei", "ieo", "iea", "iye", "iyy", "iyu", "iyi", "iyo",
                "iya", "iue", "iuy", "iuu", "iui", "iuo", "iua", "iie", "iiy", "iiu", "iii",
                "iio", "iia", "ioe", "ioy", "iou", "ioi", "ioo", "ioa", "iae", "iay", "iau",
                "iai", "iao", "iaa", "oee", "oey", "oeu", "oei", "oeo", "oea", "oye", "oyy", "oyu", "oyi", "oyo", "oya", "oue", "ouy", "ouu", "oui", "ouo", "oua", "oie", "oiy", "oiu", "oii", "oio", "oia", "ooe", "ooy", "oou", "ooi", "ooo", "ooa", "oae", "oay", "oau", "oai", "oao", "oaa", "aee", "aey", "aeu", "aei", "aeo", "aea", "aye", "ayy", "ayu", "ayi", "ayo", "aya", "aue", "auy", "auu", "aui", "auo", "aua", "aie", "aiy", "aiu", "aii", "aio",
                "aia", "aoe", "aoy", "aou", "aoi", "aoo", "aoa", "aae", "aay", "aau", "aai", "aao", "aaa"};

        for(int i = 0;i < n;i++){
            sarray[i] = scanner.next();
        }

        int counter;
        for (String s:sarray){
            counter = 0;
            for (String v:vowels){
                if (!contains(s,v))
                        counter++;
            }
            if (counter == vowels.length)
                System.out.println(s);
        }

    }

    public static boolean contains(String str, String substr){
        int check = str.indexOf(substr);
        return check != -1;
    }

}
