package o;

import android.database.ContentObserver;
import android.database.Cursor;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class uy extends ContentObserver {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(pe7 pe7Var) {
        super(new Handler());
        this.b = pe7Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                super.onChange(z);
                AudioManager audioManager = (AudioManager) ((wy) this.b).y.getSystemService("audio");
                if (audioManager == null) {
                    ye4.c("AudioManager", "Android AudioManager is null: cannot determine audio volume");
                    return;
                }
                int streamVolume = audioManager.getStreamVolume(3);
                wy wyVar = (wy) this.b;
                boolean z2 = streamVolume <= 0;
                synchronized (wyVar) {
                    if (wyVar.u != z2) {
                        wyVar.u = z2;
                        ye4.a("AudioManager", "mute audio: " + z2);
                        wyVar.m();
                    }
                    break;
                }
                return;
            case 1:
                pe7 pe7Var = (pe7) this.b;
                if (!pe7Var.n || (cursor = pe7Var.f1827o) == null || cursor.isClosed()) {
                    return;
                }
                pe7Var.m = pe7Var.f1827o.requery();
                return;
            default:
                super.onChange(z);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(kf0 kf0Var, Handler handler) {
        super(handler);
        this.b = kf0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(wy wyVar) {
        super(null);
        this.b = wyVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 2:
                ((kf0) this.b).b(f88.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
