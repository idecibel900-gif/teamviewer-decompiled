package o;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class br extends Exception {
    public final Status m;

    public br(Status status) {
        int i = status.m;
        String str = status.n;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.m = status;
    }
}
