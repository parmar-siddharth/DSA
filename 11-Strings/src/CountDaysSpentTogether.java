public class CountDaysSpentTogether {
    static void main() {
        String arriveAlice = "08-15";
        String leaveAlice = "08-18";
        String arriveBob = "08-16";
        String leaveBob = "08-19";

        int arriveAlicemonth = Integer.parseInt(arriveAlice.substring(0,2));
        int leaveAliceemonth = Integer.parseInt(leaveAlice.substring(0,2));
        int arriveAliceDate = Integer.parseInt(arriveAlice.substring(3,5));
        int leaveAliceDate = Integer.parseInt(leaveAlice.substring(3,5));
        int arriveBobmonth = Integer.parseInt(arriveBob.substring(0,2));
        int leaveBobmonth = Integer.parseInt(leaveBob.substring(0,2));
        int arriveBobDate = Integer.parseInt(arriveBob.substring(3,5));
        int leaveBobDate = Integer.parseInt(leaveBob.substring(3,5));
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int aliceTotalDays = 0;
        for(int i = 0; i < arriveAlicemonth; i++){
            aliceTotalDays += daysInMonth[i];
        }
        int arriveAliceDays = aliceTotalDays;
        arriveAliceDays += arriveAliceDate;
        int leaveAliceDays = aliceTotalDays;
        leaveAliceDays += leaveAliceDate;
        int bobTotalDays = 0;
        for(int i = 0; i < arriveBobmonth; i++){
            bobTotalDays += daysInMonth[i];
        }
        int arriveBobDays = bobTotalDays;
        arriveBobDays += arriveBobDate;
        int leaveBobDays = bobTotalDays;
        leaveBobDays += leaveBobDate;
        int start = Math.max(arriveAliceDays,arriveBobDays);
        int end = Math.min(leaveAliceDays,leaveBobDays);
        System.out.println(arriveAliceDays);
        System.out.println(arriveBobDays);
        System.out.println(leaveAliceDays);
        System.out.println(leaveBobDays);
        if(start <= end){
            System.out.println(end - start + 1);
        }
        else System.out.println(0);
    }
}
