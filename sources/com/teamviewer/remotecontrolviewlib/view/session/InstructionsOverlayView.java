package com.teamviewer.remotecontrolviewlib.view.session;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.p2;
import o.jk3;
import o.kk3;
import o.lk3;
import o.p50;
import o.qz5;

/* JADX INFO: loaded from: classes.dex */
public final class InstructionsOverlayView extends RelativeLayout implements View.OnLayoutChangeListener {
    public static final /* synthetic */ int v = 0;
    public final PointF m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f70o;
    public float p;
    public Bitmap q;
    public Canvas r;
    public View s;
    public final int t;
    public lk3 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public InstructionsOverlayView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0, 0);
        this.m = new PointF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qz5.b, 0, 0);
            this.t = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        setWillNotDraw(false);
        this.n = getContext().getColor(R.color.m2m_instructions_background_translucent);
        Paint paint = new Paint();
        this.f70o = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Context context2 = getContext();
        context2.getClass();
        ((M2MClientActivity) context2).M = this;
    }

    public final void a() {
        String str = "android.resource://" + getContext().getPackageName() + "/" + R.raw.locked_small;
        String str2 = "android.resource://" + getContext().getPackageName() + "/" + R.raw.unlocked_small;
        jk3 jk3Var = new jk3();
        p50 p50Var = new p50((byte) 1);
        VideoView videoView = (VideoView) findViewById(R.id.locked_video);
        videoView.setVideoURI(Uri.parse(str));
        videoView.setZOrderMediaOverlay(true);
        videoView.setZOrderOnTop(true);
        videoView.setOnPreparedListener(jk3Var);
        videoView.setOnErrorListener(p50Var);
        VideoView videoView2 = (VideoView) findViewById(R.id.unlocked_video);
        videoView2.setVideoURI(Uri.parse(str2));
        videoView2.setZOrderMediaOverlay(true);
        videoView2.setZOrderOnTop(true);
        videoView2.setOnPreparedListener(jk3Var);
        videoView2.setOnErrorListener(p50Var);
    }

    public final void b(boolean z) {
        this.u = z ? lk3.m : lk3.n;
        removeAllViews();
        if (z) {
            View.inflate(getContext(), R.layout.m2m_max_zoom_reached, this);
        } else if (getResources().getConfiguration().orientation == 2) {
            View.inflate(getContext(), R.layout.m2m_intro_zoom_land, this);
            postDelayed(new kk3(this, (byte) 0), 2000L);
        } else {
            View.inflate(getContext(), R.layout.m2m_intro_zoom_port, this);
        }
        ((Button) findViewById(R.id.instructions_got_it_button)).setOnClickListener(new p2(this, (byte) 12));
        c();
        if (z) {
            return;
        }
        a();
        ((VideoView) findViewById(R.id.locked_video)).start();
        ((VideoView) findViewById(R.id.unlocked_video)).start();
    }

    public final void c() {
        double dMax;
        TextView textView;
        View view;
        int height;
        if (this.u == lk3.m && (textView = (TextView) findViewById(R.id.instructions_text)) != null && (view = this.s) != null) {
            int top = view.getTop();
            int width = view.getWidth();
            if (getResources().getConfiguration().orientation == 2) {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231138, 0);
                height = ((view.getHeight() - textView.getHeight()) / 2) + top;
                width += (view.getWidth() / 2) + getResources().getDimensionPixelSize(R.dimen.m2m_instructions_arrow_hole_margin);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231139, 0);
                height = top + ((int) (view.getHeight() * 1.5f));
            }
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.getClass();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, height, width, layoutParams2.bottomMargin);
            textView.setLayoutParams(layoutParams2);
        }
        View view2 = this.s;
        if (view2 != null) {
            this.m.set((view2.getWidth() / 2.0f) + view2.getLeft(), (view2.getHeight() / 2.0f) + view2.getTop());
        }
        View view3 = this.s;
        if (view3 != null) {
            boolean z = lk3.n == this.u;
            float f = 1.0f;
            if (getResources().getConfiguration().orientation == 2) {
                dMax = Math.max(view3.getWidth(), view3.getHeight());
                if (z) {
                    f = 0.55f;
                }
            } else {
                dMax = Math.max(view3.getWidth(), view3.getHeight());
                if (z) {
                    f = 0.75f;
                }
            }
            this.p = (float) (dMax * ((double) f));
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup) || (i = this.t) == 0) {
            return;
        }
        View viewFindViewById = ((ViewGroup) parent).findViewById(i);
        this.s = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.addOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.s;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
        Canvas canvas = this.r;
        if (canvas != null) {
            canvas.setBitmap(null);
        }
        this.r = null;
        Bitmap bitmap = this.q;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        super.onDraw(canvas);
        lk3 lk3Var = this.u;
        Bitmap bitmap = this.q;
        if (lk3.n != lk3Var) {
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            Canvas canvas3 = this.r;
            if (canvas3 != null) {
                canvas3.drawColor(this.n);
            }
        } else if (bitmap != null) {
            bitmap.eraseColor(-16777216);
        }
        Paint paint = this.f70o;
        if (paint != null && (canvas2 = this.r) != null) {
            PointF pointF = this.m;
            canvas2.drawCircle(pointF.x, pointF.y, this.p, paint);
        }
        Bitmap bitmap2 = this.q;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        post(new kk3(this, (byte) 1));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Bitmap bitmap = this.q;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.q = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Bitmap bitmap2 = this.q;
        bitmap2.getClass();
        this.r = new Canvas(bitmap2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstructionsOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstructionsOverlayView(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
