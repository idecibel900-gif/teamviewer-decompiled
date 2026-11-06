package o;

/* JADX INFO: loaded from: classes.dex */
public final class az extends xy {
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public az(ak7 ak7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ak7Var.getClass();
        ci7 ci7VarQ = ak7Var.q(lj7.TVCmdMMChangeCodecSpxFpp);
        if (ci7VarQ.a > 0) {
            i = ci7VarQ.b;
        } else {
            ye4.c("SpeexParams", "fpp not set in command");
            i = 4;
        }
        ci7 ci7VarQ2 = ak7Var.q(lj7.TVCmdMMChangeCodecSpxBitrate);
        if (ci7VarQ2.a > 0) {
            i2 = ci7VarQ2.b;
        } else {
            ye4.c("SpeexParams", "bitrate not set in command");
            i2 = 2048;
        }
        ci7 ci7VarQ3 = ak7Var.q(lj7.TVCmdMMChangeCodecSpxVbr);
        if (ci7VarQ3.a > 0) {
            i3 = ci7VarQ3.b;
        } else {
            ye4.c("SpeexParams", "vbr not set in command");
            i3 = 1;
        }
        ci7 ci7VarQ4 = ak7Var.q(lj7.TVCmdMMChangeCodecSpxCmplx);
        int i7 = 5;
        if (ci7VarQ4.a > 0) {
            i4 = ci7VarQ4.b;
        } else {
            ye4.c("SpeexParams", "cmplx not set in command");
            i4 = 5;
        }
        ci7 ci7VarQ5 = ak7Var.q(lj7.TVCmdMMChangeCodecSpxQual);
        if (ci7VarQ5.a > 0) {
            i7 = ci7VarQ5.b;
        } else {
            ye4.c("SpeexParams", "qual not set in command");
        }
        ci7 ci7VarQ6 = ak7Var.q(lj7.TVCmdMMChangeCodecSpxVad);
        if (ci7VarQ6.a > 0) {
            i5 = ci7VarQ6.b;
        } else {
            ye4.c("SpeexParams", "vad not set in command");
            i5 = 1;
        }
        ci7 ci7VarQ7 = ak7Var.q(lj7.TVCmdMMChangeCodecSpxDtx);
        if (ci7VarQ7.a > 0) {
            i6 = ci7VarQ7.b;
        } else {
            ye4.c("SpeexParams", "dtx not set in command");
            i6 = 1;
        }
        this.e = i;
        this.f = i2;
        this.g = i7;
        this.h = i4;
        this.i = i3;
        this.j = i5;
        this.k = i6;
        this.a = true;
    }

    public az() {
        this.e = 4;
        this.f = 2048;
        this.g = 5;
        this.h = 5;
        this.i = 1;
        this.j = 1;
        this.k = 1;
        this.a = true;
    }
}
