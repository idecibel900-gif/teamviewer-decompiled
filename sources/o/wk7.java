package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;

/* JADX INFO: loaded from: classes.dex */
public final class wk7 implements ub3 {
    public final ec3 a;
    public final EventHub b;
    public final Resources c;
    public final Point d;
    public final Point e;
    public final Point f;
    public Bitmap g;
    public Bitmap h;
    public float i;
    public byte j;
    public boolean k;
    public final Point l;
    public ClientViewOpenGL m;
    public h10 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ar f2423o;
    public Bitmap p;
    public n87 q;
    public final fc1 r;
    public pq6 s;
    public int t;
    public final t7 u;

    public wk7(ec3 ec3Var, EventHub eventHub, Resources resources) {
        ec3Var.getClass();
        eventHub.getClass();
        this.a = ec3Var;
        this.b = eventHub;
        this.c = resources;
        this.d = new Point(0, 0);
        this.e = new Point(0, 0);
        this.f = new Point(0, 0);
        this.i = 1.0f;
        this.l = new Point(0, 0);
        this.r = hm3.e();
        t7 t7Var = new t7(this, (byte) 2);
        this.u = t7Var;
        h10 h10Var = new h10(this);
        h10Var.start();
        this.n = h10Var;
        if (eventHub.c(EventType.EVENT_INPUT_DISABLED, t7Var)) {
            ye4.a("TVMouse", "register InputDisabled event successful");
        } else {
            ye4.c("TVMouse", "register InputDisabled event failed");
        }
    }

    @Override // o.ub3
    public final synchronized void a(int i, boolean z) {
        bk7 bk7Var = bk7.TVCmdMouse;
        ParticipantIdentifier participantIdentifierA = ((a2) this.a).r.a();
        ak7 ak7Var = new ak7(bk7Var);
        ak7Var.z(KnownStreams.PrivateStream);
        ak7Var.B(participantIdentifierA);
        ak7Var.d(nj7.X, this.d.x + this.l.x);
        ak7Var.d(nj7.Y, this.d.y + this.l.y);
        ak7Var.d(nj7.Wheel, i);
        ak7Var.b(nj7.HWheel, z ? (byte) 1 : (byte) 0);
        ak7Var.d(nj7.Buttons, 0);
        ((a2) this.a).f(ak7Var, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ub3
    public final synchronized void b(int i) {
        this.j = i;
        bk7 bk7Var = bk7.TVCmdMouse;
        ParticipantIdentifier participantIdentifierA = ((a2) this.a).r.a();
        ak7 ak7Var = new ak7(bk7Var);
        ak7Var.z(KnownStreams.PrivateStream);
        ak7Var.B(participantIdentifierA);
        ak7Var.d(nj7.X, this.d.x + this.l.x);
        ak7Var.d(nj7.Y, this.d.y + this.l.y);
        ak7Var.d(nj7.Buttons, i);
        ((a2) this.a).f(ak7Var, true);
    }

    @Override // o.ub3
    public final synchronized void c(int i) {
        try {
            if (((a2) this.a).f283o.d()) {
                bk7 bk7Var = bk7.TVCmdMouse;
                ParticipantIdentifier participantIdentifierA = ((a2) this.a).r.a();
                ak7 ak7Var = new ak7(bk7Var);
                KnownStreams knownStreams = KnownStreams.PrivateStream;
                ak7Var.z(knownStreams);
                ak7Var.B(participantIdentifierA);
                nj7 nj7Var = nj7.X;
                ak7Var.d(nj7Var, this.d.x + this.l.x);
                nj7 nj7Var2 = nj7.Y;
                ak7Var.d(nj7Var2, this.d.y + this.l.y);
                nj7 nj7Var3 = nj7.Buttons;
                ak7Var.d(nj7Var3, i);
                ((a2) this.a).f(ak7Var, true);
                ParticipantIdentifier participantIdentifierA2 = ((a2) this.a).r.a();
                ak7 ak7Var2 = new ak7(bk7Var);
                ak7Var2.z(knownStreams);
                ak7Var2.B(participantIdentifierA2);
                ak7Var2.d(nj7Var, this.d.x + this.l.x);
                ak7Var2.d(nj7Var2, this.d.y + this.l.y);
                ak7Var2.d(nj7Var3, 0);
                ((a2) this.a).f(ak7Var2, true);
            } else {
                bk7 bk7Var2 = bk7.TVCmdShowMarker;
                ParticipantIdentifier participantIdentifierA3 = ((a2) this.a).r.a();
                ak7 ak7Var3 = new ak7(bk7Var2);
                ak7Var3.z(KnownStreams.PrivateStream);
                ak7Var3.B(participantIdentifierA3);
                ak7Var3.d(sj7.MarkerX, this.d.x + this.l.x);
                ak7Var3.d(sj7.MarkerY, this.d.y + this.l.y);
                ((a2) this.a).f(ak7Var3, false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(int i, int i2) {
        Point point = this.d;
        point.x = i;
        point.y = i2;
        pq6 pq6Var = this.s;
        if (pq6Var != null) {
            point.getClass();
            float f = pq6Var.a;
            point.x = (int) (point.x / f);
            point.y = (int) (point.y / f);
        }
    }

    @Override // o.ub3
    public final void destroy() {
        n87 n87Var = this.q;
        if (n87Var != null) {
            n87Var.j(null);
        }
    }

    public final void e(float f, float f2) {
        ClientViewOpenGL clientViewOpenGL = this.m;
        if (clientViewOpenGL == null) {
            ye4.c("TVMouse", "control is null");
            return;
        }
        j97 zoomState = clientViewOpenGL.getZoomState();
        v97 v97Var = zoomState != null ? (v97) zoomState.getValue() : null;
        if (v97Var == null) {
            ye4.c("TVMouse", "imageControlZoomState is null");
            return;
        }
        i12 i12Var = (i12) clientViewOpenGL.getDimensionView().getValue();
        int i = i12Var.a;
        int i2 = i12Var.b;
        float f3 = 1.0f / v97Var.b;
        float f4 = 1.0f / v97Var.c;
        Point point = this.d;
        int i3 = point.x + ((int) (f * f3));
        point.x = i3;
        int i4 = point.y + ((int) (f2 * f4));
        point.y = i4;
        if (i3 < 0) {
            point.x = 0;
        } else if (i3 > i) {
            point.x = i;
        }
        if (i4 < 0) {
            point.y = 0;
        } else if (i4 > i2) {
            point.y = i2;
        }
        this.k = true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final void f() {
        float width;
        Bitmap bitmap = this.h;
        int i = this.t;
        if (i > 0) {
            width = i / 100.0f;
        } else if (bitmap != null) {
            width = bitmap.getWidth() / 32.0f;
            if (width < 1.0f) {
                width = 1.0f;
            }
        } else {
            width = 1.0f;
        }
        this.i = this.c.getDisplayMetrics().density / width;
    }
}
