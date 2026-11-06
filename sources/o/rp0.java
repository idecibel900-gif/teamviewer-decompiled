package o;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class rp0 {
    public static final SimpleDateFormat a = new SimpleDateFormat("HH:mm", Locale.getDefault());
    public static final SimpleDateFormat b = new SimpleDateFormat("MMM d ''yy", Locale.getDefault());
    public static final SimpleDateFormat c = new SimpleDateFormat("EEEE, d. MMM yyyy", Locale.getDefault());

    public static String a(long j) {
        String str = a.format(new Date(j));
        str.getClass();
        return str;
    }
}
