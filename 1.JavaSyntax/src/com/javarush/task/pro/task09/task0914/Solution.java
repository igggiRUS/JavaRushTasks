package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
        System.out.println();
    }

    public static String changePath(String path, String jdk) {
        int indexJdk = path.indexOf("jdk");
        int lastIndeJdk = path.indexOf('/', indexJdk);
        String oldVersionJdk = path.substring(indexJdk, lastIndeJdk);
        return path.replace(oldVersionJdk, jdk);
    }
}

//        char slh = '/';
////        сосчитал сколько слешей до jdk
//        int countSlashFront = 0;
//        int countSlashBack = 0;
//        for (int i = 0; i < indexJdk; i++) {
//            if ('/' == path.charAt(i)) {
//                countSlashFront++;
//            }
//        }
////        сосчитал индекс слеша после jdk
//        countSlashBack = countSlashFront + 1;
//        int countShashBackIndex = 0;
//        int lastindexpath = 0;
//        for (int i = 0; i < path.length(); i++) {
//            if ('/' == path.charAt(i)) {
//                lastindexpath = i;
//                countShashBackIndex++;
//                if (countShashBackIndex == countSlashFront + 1) {
//                    break;
//                }
//
//            }
//        }
//        String findVersion = path.substring(indexJdk, lastindexpath);
//        String result = path.replaceAll(findVersion, jdk);
//        return result;
//    }
//}
