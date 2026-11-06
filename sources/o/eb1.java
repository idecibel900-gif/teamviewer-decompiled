package o;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class eb1 implements db1, fb1 {
    public final /* synthetic */ byte m = 0;
    public ClipData n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f699o;
    public int p;
    public Uri q;
    public Bundle r;

    public eb1(eb1 eb1Var) {
        ClipData clipData = eb1Var.n;
        clipData.getClass();
        this.n = clipData;
        byte b = eb1Var.f699o;
        if (b < 0) {
            Locale locale = Locale.US;
            hk0.g("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (b > 5) {
            Locale locale2 = Locale.US;
            hk0.g("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.f699o = b;
        int i = eb1Var.p;
        if ((i & 1) == i) {
            this.p = i;
            this.q = eb1Var.q;
            this.r = eb1Var.r;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // o.fb1
    public int A() {
        return this.p;
    }

    @Override // o.fb1
    public ContentInfo B() {
        return null;
    }

    @Override // o.db1
    public gb1 build() {
        return new gb1(new eb1(this));
    }

    @Override // o.fb1
    public int c() {
        return this.f699o;
    }

    @Override // o.fb1
    public ClipData e() {
        return this.n;
    }

    @Override // o.db1
    public void o(Uri uri) {
        this.q = uri;
    }

    @Override // o.db1
    public void q(int i) {
        this.p = i;
    }

    @Override // o.db1
    public void setExtras(Bundle bundle) {
        this.r = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.m) {
            case 1:
                Uri uri = this.q;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.n.getDescription());
                sb.append(", source=");
                byte b = this.f699o;
                if (b == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (b == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (b == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (b == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (b != 4) {
                    strValueOf = b != 5 ? String.valueOf((int) b) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i = this.p;
                sb.append((i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return e41.l(sb, this.r != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ eb1() {
    }
}
