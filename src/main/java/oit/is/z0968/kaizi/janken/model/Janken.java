package oit.is.z0968.kaizi.janken.model;



public class Janken {
int hand;

 public Janken(int hand){
   this.hand = hand;
 }

 public String result(){
  String zibun = "";
  if(hand == 0){
    zibun = "ぐー";
  }
  if(hand == 1){
    zibun = "ちょき";
  }
  if(hand == 2){
    zibun = "ぱー";
  }
  return zibun;
 }

 public String result3(){
  String kekka="";
  if(hand == 0){
    kekka = "あいこ";
  }
  if(hand == 1){
    kekka = "まけ";
  }
  if(hand == 2){
    kekka = "かち";
  }
  return kekka;
 }

}
