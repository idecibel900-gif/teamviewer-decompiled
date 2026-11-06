package io.sentry;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;
import o.ep1;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o5 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        byte b = this.a;
        byte[] bArr = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                t1 t1Var = (t1) obj2;
                n6 n6Var = (n6) obj;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, t5.d), 512);
                    try {
                        t1Var.a(n6Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 1:
                t1 t1Var2 = (t1) obj2;
                u7 u7Var = (u7) obj;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, t5.d), 512);
                    try {
                        t1Var2.a(u7Var, bufferedWriter2);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray2;
                    } catch (Throwable th5) {
                        try {
                            bufferedWriter2.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream2.close();
                        break;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            case 2:
                t1 t1Var3 = (t1) obj2;
                i6 i6Var = (i6) obj;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, t5.d), 512);
                    try {
                        t1Var3.a(i6Var, bufferedWriter3);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray3;
                    } catch (Throwable th9) {
                        try {
                            bufferedWriter3.close();
                            break;
                        } catch (Throwable th10) {
                            th9.addSuppressed(th10);
                        }
                        throw th9;
                    }
                } catch (Throwable th11) {
                    try {
                        byteArrayOutputStream3.close();
                        break;
                    } catch (Throwable th12) {
                        th11.addSuppressed(th12);
                    }
                    throw th11;
                }
            case 3:
                t1 t1Var4 = (t1) obj2;
                h5 h5Var = (h5) obj;
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter4 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream4, t5.d), 512);
                    try {
                        t1Var4.a(h5Var, bufferedWriter4);
                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                        bufferedWriter4.close();
                        byteArrayOutputStream4.close();
                        return byteArray4;
                    } catch (Throwable th13) {
                        try {
                            bufferedWriter4.close();
                            break;
                        } catch (Throwable th14) {
                            th13.addSuppressed(th14);
                        }
                        throw th13;
                    }
                } catch (Throwable th15) {
                    try {
                        byteArrayOutputStream4.close();
                        break;
                    } catch (Throwable th16) {
                        th15.addSuppressed(th16);
                    }
                    throw th15;
                }
            case 4:
                t1 t1Var5 = (t1) obj2;
                io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) obj;
                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter5 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream5, t5.d), 512);
                    try {
                        t1Var5.a(bVar, bufferedWriter5);
                        byte[] byteArray5 = byteArrayOutputStream5.toByteArray();
                        bufferedWriter5.close();
                        byteArrayOutputStream5.close();
                        return byteArray5;
                    } catch (Throwable th17) {
                        try {
                            bufferedWriter5.close();
                            break;
                        } catch (Throwable th18) {
                            th17.addSuppressed(th18);
                        }
                        throw th17;
                    }
                } catch (Throwable th19) {
                    try {
                        byteArrayOutputStream5.close();
                        break;
                    } catch (Throwable th20) {
                        th19.addSuppressed(th20);
                    }
                    throw th19;
                }
            case 5:
                return ((SentryAndroidOptions) obj).getOrCreateDeviceInfoUtil(((io.sentry.android.core.y0) obj2).a);
            case 6:
                Bitmap bitmap = (Bitmap) obj;
                g1 logger = ((ScreenshotEventProcessor) obj2).a.getLogger();
                if (!bitmap.isRecycled()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream6);
                            bitmap.recycle();
                            if (byteArrayOutputStream6.size() <= 0) {
                                logger.g(f6.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                byteArrayOutputStream6.close();
                            } else {
                                byte[] byteArray6 = byteArrayOutputStream6.toByteArray();
                                byteArrayOutputStream6.close();
                                bArr = byteArray6;
                            }
                        } catch (Throwable th21) {
                            try {
                                byteArrayOutputStream6.close();
                                break;
                            } catch (Throwable th22) {
                                th21.addSuppressed(th22);
                            }
                            throw th21;
                        }
                    } catch (Throwable th23) {
                        logger.d(f6.ERROR, "Compressing bitmap failed.", th23);
                    }
                    break;
                }
                return bArr;
            case 7:
                Uri uri = (Uri) obj;
                long maxAttachmentSize = d5.c().l().getMaxAttachmentSize();
                InputStream inputStreamOpenInputStream = ((ContentResolver) obj2).openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    return io.sentry.util.b.m(inputStreamOpenInputStream, maxAttachmentSize);
                }
                yq4.v(uri, "Unable to open image attachment: ");
                return null;
            case 8:
                return ((ConfigCacheClient) obj2).lambda$put$0((ConfigContainer) obj);
            case ep1.b /* 9 */:
                return FcmBroadcastProcessor.lambda$startMessagingService$0((Context) obj2, (Intent) obj);
            default:
                return ((FirebaseRemoteConfig) obj2).lambda$setConfigSettingsAsync$5((FirebaseRemoteConfigSettings) obj);
        }
    }
}
