package AppointmentBook;

public class AppointmentBook {
    private boolean isMinuteFree(int period, int minute){
        // implementation not shown
        return false;
    }

    public void reserveBlock(int period, int startMinute, int duration){
        // implementation not shown
    }

    public int findFreeBlock(int period, int duration){
        for (int start = 0; start <= 60-duration; start++) {
            int consecutiveFree = 0;

            for (int i = 0; i < duration; i++) {
                if (isMinuteFree(period, start + i)) {
                    consecutiveFree++;
                } else {
                    break;
                }
            }
            if (consecutiveFree == duration) {
                return start;
            }
        }
        return -1;
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
        for (int i = startPeriod; i <= endPeriod; i++) {
            int freeStart = findFreeBlock(i, duration);
            if (freeStart >=0) {
                reserveBlock(i, freeStart, duration);
                return true;
            }
        }
        return false;
    }
}