package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import o.bj1;
import o.gj1;
import o.hk0;
import o.iz5;
import o.vk0;

/* JADX INFO: loaded from: classes.dex */
public class DecoratedBarcodeView extends FrameLayout {
    public BarcodeView m;
    public ViewfinderView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f56o;

    public DecoratedBarcodeView(Context context) {
        super(context);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iz5.c);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.m = barcodeView;
        if (barcodeView == null) {
            hk0.g("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
            return;
        }
        barcodeView.b(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
        this.n = viewfinderView;
        if (viewfinderView == null) {
            hk0.g("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        } else {
            viewfinderView.setCameraPreview(this.m);
            this.f56o = (TextView) findViewById(R.id.zxing_status_view);
        }
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public vk0 getCameraSettings() {
        return this.m.getCameraSettings();
    }

    public bj1 getDecoderFactory() {
        return this.m.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f56o;
    }

    public ViewfinderView getViewFinder() {
        return this.n;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            this.m.setTorch(true);
            return true;
        }
        if (i == 25) {
            this.m.setTorch(false);
            return true;
        }
        if (i == 27 || i == 80) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setCameraSettings(vk0 vk0Var) {
        this.m.setCameraSettings(vk0Var);
    }

    public void setDecoderFactory(bj1 bj1Var) {
        this.m.setDecoderFactory(bj1Var);
    }

    public void setStatusText(String str) {
        TextView textView = this.f56o;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(gj1 gj1Var) {
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }
}
