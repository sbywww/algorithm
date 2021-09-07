import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;

public class mark_2884 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, h + 12);
        cal.set(Calendar.MINUTE, m);
        cal.add(Calendar.MINUTE, -45);

        String[] time = formatter.format(cal.getTime()).split(":");

        String hour = String.valueOf(Integer.parseInt(time[0]));
        String minute = String.valueOf(Integer.parseInt(time[1]));

        bw.write(hour);
        bw.write(" ");
        bw.write(minute);
        bw.flush();
        br.close();
        bw.close();
    }
}
