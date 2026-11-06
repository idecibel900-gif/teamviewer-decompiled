package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class hl1 extends g2 {
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f984o;
    public yt2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl1(q77 q77Var, boolean z) {
        super(q77Var);
        q77Var.getClass();
        this.n = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6 A[Catch: RuntimeException -> 0x00ec, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00ec, blocks: (B:78:0x00e0, B:80:0x00e6), top: B:91:0x00e0 }] */
    public final yt2 B0(Context context) {
        int i;
        yt2 yt2Var;
        Animator animatorLoadAnimator;
        int iT;
        if (this.f984o) {
            return this.p;
        }
        q77 q77Var = (q77) this.m;
        ut2 ut2Var = q77Var.c;
        boolean z = q77Var.a == s77.f1990o;
        rt2 rt2Var = ut2Var.X;
        int i2 = rt2Var == null ? 0 : rt2Var.f;
        if (this.n) {
            if (z) {
                if (rt2Var == null) {
                    i = 0;
                } else {
                    i = rt2Var.d;
                }
            } else if (rt2Var == null) {
                i = 0;
            } else {
                i = rt2Var.e;
            }
        } else if (z) {
            if (rt2Var == null) {
                i = 0;
            } else {
                i = rt2Var.b;
            }
        } else if (rt2Var == null) {
            i = 0;
        } else {
            i = rt2Var.c;
        }
        ut2Var.t0(0, 0, 0, 0);
        ViewGroup viewGroup = ut2Var.T;
        yt2 yt2Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            ut2Var.T.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = ut2Var.T;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iT = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i2 == 8194) {
                    iT = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i2 == 8197) {
                    iT = z ? zu1.T(context, android.R.attr.activityCloseEnterAnimation) : zu1.T(context, android.R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iT = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i2 != 4100) {
                    iT = -1;
                } else {
                    iT = z ? zu1.T(context, android.R.attr.activityOpenEnterAnimation) : zu1.T(context, android.R.attr.activityOpenExitAnimation);
                }
                i = iT;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            yt2Var = new yt2(animationLoadAnimation, (byte) 0);
                            yt2Var2 = yt2Var;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                yt2Var = new yt2(animatorLoadAnimator);
                                yt2Var2 = yt2Var;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                yt2Var2 = new yt2(animationLoadAnimation2, (byte) 0);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        yt2Var = new yt2(animatorLoadAnimator);
                        yt2Var2 = yt2Var;
                    }
                }
            }
        }
        this.p = yt2Var2;
        this.f984o = true;
        return yt2Var2;
    }
}
