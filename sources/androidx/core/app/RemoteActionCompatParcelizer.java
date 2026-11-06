package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import o.fd8;
import o.gd8;
import o.hd8;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(fd8 fd8Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        hd8 hd8VarG = remoteActionCompat.a;
        boolean z = true;
        if (fd8Var.e(1)) {
            hd8VarG = fd8Var.g();
        }
        remoteActionCompat.a = (IconCompat) hd8VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (fd8Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((gd8) fd8Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (fd8Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((gd8) fd8Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) fd8Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (fd8Var.e(5)) {
            z2 = ((gd8) fd8Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!fd8Var.e(6)) {
            z = z3;
        } else if (((gd8) fd8Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, fd8 fd8Var) {
        fd8Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        fd8Var.h(1);
        fd8Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        fd8Var.h(2);
        Parcel parcel = ((gd8) fd8Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        fd8Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        fd8Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        fd8Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        fd8Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
