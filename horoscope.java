package know.your;

import java.util.Scanner;

public class horoscope {
    public static void CheckHoroscope(int Date, String Month){
        if(Month.equals("january")){
            if(Date>=20){
                System.out.println("Welcome Mighty Aquarius !!");
                System.out.println("If Elvis Presley is who you dreamed of being, today may be your day! You seem to impress one and all, and even money flows in! You play smart today and everything seems to work in your favour. Take care, says Ganesha, things may not be as they seem.");
            }else{
                System.out.println("Welcome Mighty Capricorn !! ");
                System.out.println("Your intuition will get the better of you today, bagging you respect and recognition, says Ganesha. But it's not every day that you get so lucky, so try and make the most of what's on the platter, for all you know, intuitions could have a mood swing too. Besides, if winning hearts is like a once-in-a-blue-moon thing, be on your best behaviour and wear your best suit — it's a blue moon day for you today.");
            }
        }else if(Month.equals("february")){
            if(Date>=19){
                System.out.println("Welcome lovely Pisces !!");
                System.out.println("A hectic day of socialising awaits you. You will discover hidden talents and unnoticed traits about yourself. Either that, or whoever brought them to your notice was only lying to get some socialising action of their own. You are a person of action, as well as of words, and hence, will go on to act on what you have planned, says Ganesha.");
            }else{
                System.out.println("Welcome Mighty Aquarius");
                System.out.println("If Elvis Presley is who you dreamed of being, today may be your day! You seem to impress one and all, and even money flows in! You play smart today and everything seems to work in your favour. Take care, says Ganesha, things may not be as they seem.");
            }
        }else if(Month.equals("march")){
            if(Date>=21){
                System.out.println("Welcome Mighty Aries");
                System.out.println("You may pick up the hammer and chisel today. No, you're not taking up sculpture; you're finally giving in to your spouse's demands to take some home improvement measures. It's in your interest to be speedy and focused, as you are the guilty party, says Ganesha.");
            }else{
                System.out.println("Welcome lovely Pisces");
                System.out.println("A hectic day of socialising awaits you. You will discover hidden talents and unnoticed traits about yourself. Either that, or whoever brought them to your notice was only lying to get some socialising action of their own. You are a person of action, as well as of words, and hence, will go on to act on what you have planned, says Ganesha.");
            }
        }else if(Month.equals("april")){
            if (Date>=20){
                System.out.println("Welcome Mighty Taurus!!");
                System.out.println("There is a strong possibility of receptivity and sensitivity in your love life. On the down side, your negativity may lead to mediocre results. You are a fire-fighter when it comes to others' problems, but can forget digging a well for your own home, says Ganesha.");
            }else{
                System.out.println("Welcome Mighty Aries!!");
                System.out.println("You may pick up the hammer and chisel today. No, you're not taking up sculpture; you're finally giving in to your spouse's demands to take some home improvement measures. It's in your interest to be speedy and focused, as you are the guilty party, says Ganesha.");
            }
        }else if(Month.equals("may")){
            if(Date>=21){
                System.out.println("Welcome lovely Gemini!!");
                System.out.println("Today, you may be busy purchasing food supplies or penning an inventory. In your spare time, which you are likely to have in plenty today, you will try to befriend strangers or tread into unfamiliar territories. Such activities will not bring you any harm. A stroll with your sweetheart will nicely conclude a fairly eventful day, says Ganesha.");
            }else{
                System.out.println("Welcome Mighty Taurus!!");
                System.out.println("There is a strong possibility of receptivity and sensitivity in your love life. On the down side, your negativity may lead to mediocre results. You are a fire-fighter when it comes to others' problems, but can forget digging a well for your own home, says Ganesha.");
            }
        }else if(Month.equals("june")){
            if(Date>=21){
                System.out.println("Welcome Mighty Cancer!!");
                System.out.println("In all likelihood, this is going to be a fairly easy day for you, says Ganesha. The only tough part of the day would be how to spend it. There will be hardly anything to do, anyone to talk to. Ideally, this is what you would call a perfect day. But not today. Today, you'll miss people. You will find yourself more at peace with the unbearable chaos of the outer world than the deafening calm of your solitude. So, when you get your chance to rejoin the human race in its daily messy routine, you will be more than happy to oblige, says Ganesha");
            }else{
                System.out.println("Welcome Mighty Gemini!!");
                System.out.println("Today, you may be busy purchasing food supplies or penning an inventory. In your spare time, which you are likely to have in plenty today, you will try to befriend strangers or tread into unfamiliar territories. Such activities will not bring you any harm. A stroll with your sweetheart will nicely conclude a fairly eventful day, says Ganesha.");
            }
        }else if(Month.equals("july")){
            if (Date>=23){
                System.out.println("Welcome Mighty Leo!!");
                System.out.println("Call it an epiphany of sorts, but today promises to be a day of revelations for you. Finally, things fall into place as your Odyssey nears its end, and you come to terms with your hidden talents, says Ganesha. Follow your heart and dive into the bottomless pool of your imagination. With limitless ideas, and a silver spoon to match your steady hand, you are perfectly poised to act on what you have thought out clearly.");
            }else{
                System.out.println("Welcome Mighty Cancer!!");
                System.out.println("In all likelihood, this is going to be a fairly easy day for you, says Ganesha. The only tough part of the day would be how to spend it. There will be hardly anything to do, anyone to talk to. Ideally, this is what you would call a perfect day. But not today. Today, you'll miss people. You will find yourself more at peace with the unbearable chaos of the outer world than the deafening calm of your solitude. So, when you get your chance to rejoin the human race in its daily messy routine, you will be more than happy to oblige, says Ganesha");
            }
        }else if(Month.equals("august")){
            if (Date>=23){
                System.out.println("Welcome Lovely Virgo!!");
                System.out.println("Ganesha predicts that your writing skills will possibly help you vent your feelings without offending others. You will successfully complete your pending assignments. Great success will knock at your door in anything and everything you undertake today, predicts Ganesha.");
            }else{
                System.out.println("Welcome Mighty Leo!!");
                System.out.println("Call it an epiphany of sorts, but today promises to be a day of revelations for you. Finally, things fall into place as your Odyssey nears its end, and you come to terms with your hidden talents, says Ganesha. Follow your heart and dive into the bottomless pool of your imagination. With limitless ideas, and a silver spoon to match your steady hand, you are perfectly poised to act on what you have thought out clearly.");
            }
        }else if(Month.equals("september")){
            if (Date>=23){
                System.out.println("Welcome Mighty Libra!!");
                System.out.println("Health is always a key issue, and today, you may have to pay some special attention to the same. It may be some elderly person in the family, or even you. Take the time to give it your full attention in order to avoid any further complications. You may do well to undergo a physical examination yourself. Remember, health is wealth. Take care. Ganesha wishes you a healthy day.");
            }else{
                System.out.println("Welcome Mighty Virgo!!");
                System.out.println("Ganesha predicts that your writing skills will possibly help you vent your feelings without offending others. You will successfully complete your pending assignments. Great success will knock at your door in anything and everything you undertake today, predicts Ganesha.");
            }
        }else if(Month.equals("october")){
            if(Date>=23){
                System.out.println("Welcome Mighty Scorpio!!");
                System.out.println("The target is locked in and the arrow is shot. It is only a matter of time before Cupid celebrates and hits the bull's eye and you find yourself in the mush of things. Sentiments and romance will be the order of the day. There is a good chance that marriage proposals or new relationships will find their footing today, says Ganesha.");
            }else{
                System.out.println("Welcome Mighty Libra!!");
                System.out.println("Health is always a key issue, and today, you may have to pay some special attention to the same. It may be some elderly person in the family, or even you. Take the time to give it your full attention in order to avoid any further complications. You may do well to undergo a physical examination yourself. Remember, health is wealth. Take care. Ganesha wishes you a healthy day.");
            }
        }else if(Month.equals("november")){
            if(Date>=22){
                System.out.println("Welcome Mighty Sagittarius!!");
                System.out.println("Appreciation for all that excellent work you have put in is a no-go for you! Yet, you stand to gain nothing by losing heart. While the acknowledgement you look for has been delayed, Ganesha says it has not been denied and is in the offing already");
            }else{
                System.out.println("Welcome Mighty Scorpio!!");
                System.out.println("The target is locked in and the arrow is shot. It is only a matter of time before Cupid celebrates and hits the bull's eye and you find yourself in the mush of things. Sentiments and romance will be the order of the day. There is a good chance that marriage proposals or new relationships will find their footing today, says Ganesha.");
            }
        }else if(Month.equals("december")){
            if (Date>=22){
                System.out.println("Welcome Mighty Capricorn!!");
                System.out.println("Your intuition will get the better of you today, bagging you respect and recognition, says Ganesha. But it's not every day that you get so lucky, so try and make the most of what's on the platter, for all you know, intuitions could have a mood swing too. Besides, if winning hearts is like a once-in-a-blue-moon thing, be on your best behaviour and wear your best suit — it's a blue moon day for you today.");
            }else{
                System.out.println("Welcome Mighty Sagittarius!!");
                System.out.println("Appreciation for all that excellent work you have put in is a no-go for you! Yet, you stand to gain nothing by losing heart. While the acknowledgement you look for has been delayed, Ganesha says it has not been denied and is in the offing already");
            }
        }else { 
            System.out.println("Invalid Input");
        }

    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome User ");
        System.out.println("do you want to know your horoscope and its character traits ?");
        System.out.println("Type 'yes' to continue and 'no' to exit !");
        String answer= input.nextLine();

        if(answer.equals("no")){
            System.out.println("Thanks for coming !! have a nice day.");
        }else{
            System.out.println("Enter your date of birth in range 1 to 31.");
            int Date= input.nextInt();
            input.nextLine();
            System.out.println("Enter your month of birth.");
            String Month= input.nextLine();
            Month= Month.toLowerCase();
            CheckHoroscope( Date, Month);
        }

    }
}
