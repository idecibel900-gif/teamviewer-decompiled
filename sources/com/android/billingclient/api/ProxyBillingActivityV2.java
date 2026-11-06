package com.android.billingclient.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import o.a8;
import o.df6;
import o.e8;
import o.il3;
import o.k8;
import o.my0;
import o.tr8;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends my0 {
    public k8 H;
    public k8 I;
    public k8 J;
    public k8 K;
    public k8 L;
    public k8 M;
    public ResultReceiver N;
    public ResultReceiver O;
    public ResultReceiver P;
    public ResultReceiver Q;
    public ResultReceiver R;
    public ResultReceiver S;

    public static final df6 D() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            df6 df6Var = new df6(activityOptionsMakeBasic, (byte) 9);
            if (i >= 34) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(3);
                return df6Var;
            }
            if (i >= 33) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityLaunchAllowed(true);
            }
            return df6Var;
        }
        if (i < 34) {
            return null;
        }
        ActivityOptions activityOptionsMakeBasic2 = ActivityOptions.makeBasic();
        df6 df6Var2 = new df6(activityOptionsMakeBasic2, (byte) 9);
        if (i >= 34) {
            activityOptionsMakeBasic2.setPendingIntentBackgroundActivityStartMode(1);
            return df6Var2;
        }
        if (i >= 33) {
            activityOptionsMakeBasic2.setPendingIntentBackgroundActivityLaunchAllowed(true);
        }
        return df6Var2;
    }

    @Override // o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final byte b = 4;
        final byte b2 = 0;
        this.H = (k8) C(new a8(this) { // from class: o.ut8
            public final /* synthetic */ ProxyBillingActivityV2 n;

            {
                this.n = this;
            }

            @Override // o.a8
            public final void a(Object obj) {
                Bundle extras;
                byte b3 = b2;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.n;
                z7 z7Var = (z7) obj;
                switch (b3) {
                    case 0:
                        Intent intent = z7Var.n;
                        int i = tr8.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        int i2 = z7Var.m;
                        if (i2 != -1 || i != 0) {
                            tr8.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = z7Var.n;
                        int i3 = tr8.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.O;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i3, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i4 = z7Var.m;
                        if (i4 != -1 || i3 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = z7Var.n;
                        int i5 = z7Var.m;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i5 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i5);
                        }
                        int i6 = tr8.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.P;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i6, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i6 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = z7Var.n;
                        int i7 = z7Var.m;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i7 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i7);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i7);
                        }
                        int i8 = tr8.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.Q;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i8, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i8 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i8);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = z7Var.n;
                        int i9 = tr8.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.R;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i9, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i10 = z7Var.m;
                        if (i10 != -1 || i9 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i10 + " and billing's responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = z7Var.n;
                        int i11 = tr8.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.S;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i11, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i12 = z7Var.m;
                        if (i12 != -1 || i11 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new e8((byte) 4));
        final byte b3 = 1;
        this.I = (k8) C(new a8(this) { // from class: o.ut8
            public final /* synthetic */ ProxyBillingActivityV2 n;

            {
                this.n = this;
            }

            @Override // o.a8
            public final void a(Object obj) {
                Bundle extras;
                byte b4 = b3;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.n;
                z7 z7Var = (z7) obj;
                switch (b4) {
                    case 0:
                        Intent intent = z7Var.n;
                        int i = tr8.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        int i2 = z7Var.m;
                        if (i2 != -1 || i != 0) {
                            tr8.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = z7Var.n;
                        int i3 = tr8.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.O;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i3, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i4 = z7Var.m;
                        if (i4 != -1 || i3 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = z7Var.n;
                        int i5 = z7Var.m;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i5 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i5);
                        }
                        int i6 = tr8.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.P;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i6, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i6 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = z7Var.n;
                        int i7 = z7Var.m;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i7 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i7);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i7);
                        }
                        int i8 = tr8.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.Q;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i8, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i8 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i8);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = z7Var.n;
                        int i9 = tr8.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.R;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i9, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i10 = z7Var.m;
                        if (i10 != -1 || i9 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i10 + " and billing's responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = z7Var.n;
                        int i11 = tr8.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.S;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i11, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i12 = z7Var.m;
                        if (i12 != -1 || i11 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new e8((byte) 4));
        final byte b4 = 2;
        this.J = (k8) C(new a8(this) { // from class: o.ut8
            public final /* synthetic */ ProxyBillingActivityV2 n;

            {
                this.n = this;
            }

            @Override // o.a8
            public final void a(Object obj) {
                Bundle extras;
                byte b5 = b4;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.n;
                z7 z7Var = (z7) obj;
                switch (b5) {
                    case 0:
                        Intent intent = z7Var.n;
                        int i = tr8.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        int i2 = z7Var.m;
                        if (i2 != -1 || i != 0) {
                            tr8.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = z7Var.n;
                        int i3 = tr8.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.O;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i3, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i4 = z7Var.m;
                        if (i4 != -1 || i3 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = z7Var.n;
                        int i5 = z7Var.m;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i5 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i5);
                        }
                        int i6 = tr8.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.P;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i6, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i6 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = z7Var.n;
                        int i7 = z7Var.m;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i7 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i7);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i7);
                        }
                        int i8 = tr8.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.Q;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i8, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i8 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i8);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = z7Var.n;
                        int i9 = tr8.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.R;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i9, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i10 = z7Var.m;
                        if (i10 != -1 || i9 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i10 + " and billing's responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = z7Var.n;
                        int i11 = tr8.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.S;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i11, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i12 = z7Var.m;
                        if (i12 != -1 || i11 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new e8((byte) 4));
        final byte b5 = 3;
        this.K = (k8) C(new a8(this) { // from class: o.ut8
            public final /* synthetic */ ProxyBillingActivityV2 n;

            {
                this.n = this;
            }

            @Override // o.a8
            public final void a(Object obj) {
                Bundle extras;
                byte b6 = b5;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.n;
                z7 z7Var = (z7) obj;
                switch (b6) {
                    case 0:
                        Intent intent = z7Var.n;
                        int i = tr8.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        int i2 = z7Var.m;
                        if (i2 != -1 || i != 0) {
                            tr8.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = z7Var.n;
                        int i3 = tr8.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.O;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i3, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i4 = z7Var.m;
                        if (i4 != -1 || i3 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = z7Var.n;
                        int i5 = z7Var.m;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i5 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i5);
                        }
                        int i6 = tr8.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.P;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i6, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i6 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = z7Var.n;
                        int i7 = z7Var.m;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i7 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i7);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i7);
                        }
                        int i8 = tr8.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.Q;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i8, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i8 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i8);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = z7Var.n;
                        int i9 = tr8.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.R;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i9, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i10 = z7Var.m;
                        if (i10 != -1 || i9 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i10 + " and billing's responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = z7Var.n;
                        int i11 = tr8.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.S;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i11, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i12 = z7Var.m;
                        if (i12 != -1 || i11 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new e8((byte) 4));
        this.L = (k8) C(new a8(this) { // from class: o.ut8
            public final /* synthetic */ ProxyBillingActivityV2 n;

            {
                this.n = this;
            }

            @Override // o.a8
            public final void a(Object obj) {
                Bundle extras;
                byte b6 = b;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.n;
                z7 z7Var = (z7) obj;
                switch (b6) {
                    case 0:
                        Intent intent = z7Var.n;
                        int i = tr8.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        int i2 = z7Var.m;
                        if (i2 != -1 || i != 0) {
                            tr8.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = z7Var.n;
                        int i3 = tr8.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.O;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i3, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i4 = z7Var.m;
                        if (i4 != -1 || i3 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = z7Var.n;
                        int i5 = z7Var.m;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i5 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i5);
                        }
                        int i6 = tr8.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.P;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i6, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i6 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = z7Var.n;
                        int i7 = z7Var.m;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i7 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i7);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i7);
                        }
                        int i8 = tr8.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.Q;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i8, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i8 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i8);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = z7Var.n;
                        int i9 = tr8.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.R;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i9, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i10 = z7Var.m;
                        if (i10 != -1 || i9 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i10 + " and billing's responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = z7Var.n;
                        int i11 = tr8.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.S;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i11, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i12 = z7Var.m;
                        if (i12 != -1 || i11 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new e8((byte) 4));
        final byte b6 = 5;
        this.M = (k8) C(new a8(this) { // from class: o.ut8
            public final /* synthetic */ ProxyBillingActivityV2 n;

            {
                this.n = this;
            }

            @Override // o.a8
            public final void a(Object obj) {
                Bundle extras;
                byte b7 = b6;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.n;
                z7 z7Var = (z7) obj;
                switch (b7) {
                    case 0:
                        Intent intent = z7Var.n;
                        int i = tr8.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        int i2 = z7Var.m;
                        if (i2 != -1 || i != 0) {
                            tr8.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = z7Var.n;
                        int i3 = tr8.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.O;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i3, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i4 = z7Var.m;
                        if (i4 != -1 || i3 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = z7Var.n;
                        int i5 = z7Var.m;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i5 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i5);
                        }
                        int i6 = tr8.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.P;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i6, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i6 != 0) {
                            tr8.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = z7Var.n;
                        int i7 = z7Var.m;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i7 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i7);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i7);
                        }
                        int i8 = tr8.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.Q;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i8, extras);
                        } else {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i8 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i8);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = z7Var.n;
                        int i9 = tr8.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.R;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i9, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i10 = z7Var.m;
                        if (i10 != -1 || i9 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i10 + " and billing's responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = z7Var.n;
                        int i11 = tr8.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.S;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i11, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i12 = z7Var.m;
                        if (i12 != -1 || i11 != 0) {
                            tr8.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new e8((byte) 4));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.N = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.O = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.P = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.Q = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.R = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.S = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        tr8.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.N = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            k8 k8Var = this.H;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            k8Var.a(new il3(intentSender, null, 0, 0), D());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.O = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            k8 k8Var2 = this.I;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            k8Var2.a(new il3(intentSender2, null, 0, 0), D());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.P = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            k8 k8Var3 = this.J;
            pendingIntent3.getClass();
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            intentSender3.getClass();
            k8Var3.a(new il3(intentSender3, null, 0, 0), D());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.Q = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            k8 k8Var4 = this.K;
            pendingIntent4.getClass();
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            intentSender4.getClass();
            k8Var4.a(new il3(intentSender4, null, 0, 0), D());
            return;
        }
        if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.R = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            k8 k8Var5 = this.L;
            pendingIntent5.getClass();
            IntentSender intentSender5 = pendingIntent5.getIntentSender();
            intentSender5.getClass();
            k8Var5.a(new il3(intentSender5, null, 0, 0), D());
            return;
        }
        if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.S = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            k8 k8Var6 = this.M;
            pendingIntent6.getClass();
            IntentSender intentSender6 = pendingIntent6.getIntentSender();
            intentSender6.getClass();
            k8Var6.a(new il3(intentSender6, null, 0, 0), D());
        }
    }

    @Override // o.my0, o.ly0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.N;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.O;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.P;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.Q;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.R;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.S;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
