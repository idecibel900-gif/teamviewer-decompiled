package io.sentry;

import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public final class a6 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public z5 i;
    public io.sentry.util.i j;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SentryFeedbackOptions{isNameRequired=");
        sb.append(this.a);
        sb.append(", showName=");
        sb.append(this.b);
        sb.append(", isEmailRequired=");
        sb.append(this.c);
        sb.append(", showEmail=");
        sb.append(this.d);
        sb.append(", useSentryUser=");
        sb.append(this.e);
        sb.append(", showBranding=");
        sb.append(this.f);
        sb.append(", useShakeGesture=");
        sb.append(this.g);
        sb.append(", enableScreenshot=");
        return ua5.n(", formTitle='Report a Bug', submitButtonLabel='Send Bug Report', cancelButtonLabel='Cancel', nameLabel='Name', namePlaceholder='Your Name', emailLabel='Email', emailPlaceholder='your.email@example.org', isRequiredLabel=' (Required)', messageLabel='Description', messagePlaceholder='What's the bug? What did you expect?', addScreenshotButtonLabel='Add a screenshot', removeScreenshotButtonLabel='Remove screenshot', screenshotTooLargeMessageText='Screenshot is too large'}", sb, this.h);
    }
}
