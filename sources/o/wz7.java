package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.teamviewer.libs.materialtoolbar.ToolbarViewMovable;

/* JADX INFO: loaded from: classes.dex */
public final class wz7 implements View.OnTouchListener {
    public final float m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2463o;
    public final /* synthetic */ ToolbarViewMovable p;

    public wz7(ToolbarViewMovable toolbarViewMovable, Context context) {
        this.p = toolbarViewMovable;
        this.m = 5.0f * context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        float f2;
        ToolbarViewMovable toolbarViewMovable = this.p;
        tz7 tz7Var = toolbarViewMovable.n;
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.n = motionEvent.getRawX();
            toolbarViewMovable.p = tz7Var.getTranslationX();
            return false;
        }
        float f3 = 0.0f;
        if (action == 1) {
            this.n = 0.0f;
            if (this.f2463o) {
                int i = ToolbarViewMovable.r;
                f = toolbarViewMovable.f62o;
                f2 = toolbarViewMovable.q;
                if (Math.abs(f - f2) < Math.abs(0.0f - f2)) {
                    toolbarViewMovable.a(f2, f);
                } else {
                    toolbarViewMovable.a(f2, 0.0f);
                }
                this.f2463o = false;
                return true;
            }
        } else if (action != 2) {
            if (action == 3) {
                this.n = 0.0f;
                if (this.f2463o) {
                    int i2 = ToolbarViewMovable.r;
                    f = toolbarViewMovable.f62o;
                    f2 = toolbarViewMovable.q;
                    if (Math.abs(f - f2) < Math.abs(0.0f - f2)) {
                        toolbarViewMovable.a(f2, f);
                    } else {
                        toolbarViewMovable.a(f2, 0.0f);
                    }
                    this.f2463o = false;
                    return true;
                }
            }
        } else if (this.f2463o || Math.abs(this.n - motionEvent.getRawX()) > this.m) {
            if (!this.f2463o) {
                int i3 = ToolbarViewMovable.r;
                vz7 vz7Var = toolbarViewMovable.m;
                if (vz7Var != null) {
                    cl5 cl5Var = ((xk5) vz7Var).a.p0;
                    if (cl5Var == null) {
                        im3.e0("toolbarViewModel");
                        throw null;
                    }
                    cl5Var.f2259o.setValue(Boolean.FALSE);
                }
                this.f2463o = true;
            }
            float rawX = (motionEvent.getRawX() - this.n) + toolbarViewMovable.p;
            float f4 = toolbarViewMovable.f62o;
            if (rawX < f4) {
                f3 = f4;
            } else if (rawX <= 0.0f) {
                f3 = rawX;
            }
            tz7Var.setTranslationX(f3);
            toolbarViewMovable.q = (int) f3;
            return true;
        }
        return false;
    }
}
