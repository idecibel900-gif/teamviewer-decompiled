package o;

import android.content.Context;
import com.teamviewer.commonviewmodel.swig.ErrorCategory;
import com.teamviewer.commonviewmodel.swig.ErrorCode;
import com.teamviewer.remotecontrollib.swig.TokenLoginViewModel;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class vy2 extends uc2 {
    public final /* synthetic */ byte a = 0;
    public final Context b;
    public final Object c;
    public final Object d;

    public vy2(Context context, String str, String str2) {
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    private final void c() {
    }

    @Override // o.uc2
    public final void a(ErrorCode errorCode) {
        String string;
        switch (this.a) {
            case 0:
                ye4.c((String) this.c, ((String) this.d) + ": (" + errorCode.GetErrorId() + ", " + errorCode.GetErrorCategory() + ") " + errorCode.GetErrorMessage());
                ErrorCategory errorCategoryGetErrorCategory = errorCode.GetErrorCategory();
                ErrorCategory errorCategory = ErrorCategory.BuddyErrorCategory;
                Context context = this.b;
                if (errorCategoryGetErrorCategory == errorCategory) {
                    string = errorCode.GetErrorMessage();
                    string.getClass();
                } else {
                    string = context.getString(R.string.tv_IDS_BUDDY_SERVERERROR_1);
                    string.getClass();
                }
                if (context == null) {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                } else {
                    fx3.r(string, 1, context, bu7.MAIN);
                }
                break;
            default:
                ye4.c("PendingConnectionTv8Scheme", "Login before connection attempt failed");
                wi6.a();
                break;
        }
    }

    @Override // o.uc2
    public final void b() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((TokenLoginViewModel) this.c).b(new ji5((li5) this.d, this.b));
                wi6.a();
                break;
        }
    }

    public vy2(TokenLoginViewModel tokenLoginViewModel, li5 li5Var, Context context) {
        this.c = tokenLoginViewModel;
        this.d = li5Var;
        this.b = context;
    }
}
