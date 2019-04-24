package com.jcsmnd.problemsolving;

class direction_problem {

    public static String getRelativeDirection(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2){
            return "HERE";
        }else if (x2 < x1){
          if (y1 == y2){
              return "W";
          }else if (y2 < y1){
              return "SW";
          }else return "NW";
        }else if (x1 < x2) {
            if (y1 == y2){
                return "E";
            }else if (y2 < y1){
                return "SE";
            }else return "NE";
        }else if (x1 == x2) {
            if (y2 < y1){
                return "S";
            }
            else if (y1 < y2){
                return "N";
            }
        }
        return "ERROR";
      }
    public static void main(String[] args){
        System.out.println(getRelativeDirection(3,2,1,1)); 
    }
}

