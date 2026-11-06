package o;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Message;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.preference.Preference;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.chatviewmodel.swig.IRemoteFileMessageUIModel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class o6 implements View.OnClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ o6(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        byte b = this.m;
        Message messageObtain = null;
        messageObtain = null;
        boolean z = true;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((p7) obj).c();
                break;
            case 1:
                md mdVar = (md) obj;
                if (view == mdVar.i && (message3 = mdVar.k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == mdVar.l && (message2 = mdVar.n) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == mdVar.f1461o && (message = mdVar.q) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                mdVar.F.obtainMessage(1, mdVar.b).sendToTarget();
                break;
            case 2:
                s90 s90Var = (s90) obj;
                if (s90Var.w && s90Var.isShowing()) {
                    if (!s90Var.y) {
                        TypedArray typedArrayObtainStyledAttributes = s90Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        s90Var.x = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        s90Var.y = true;
                    }
                    if (s90Var.x) {
                        s90Var.cancel();
                    }
                    break;
                }
                break;
            case 3:
                view.getClass();
                String strGetDownloadFilePath = ((IRemoteFileMessageUIModel) obj).GetDownloadFilePath();
                strGetDownloadFilePath.getClass();
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.encode(strGetDownloadFilePath, "/"));
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                fileExtensionFromUrl.getClass();
                Locale locale = Locale.getDefault();
                locale.getClass();
                String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
                lowerCase.getClass();
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
                SimpleDateFormat simpleDateFormat = rp0.a;
                Context context = view.getContext();
                context.getClass();
                mimeTypeFromExtension.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                intent.setDataAndType(FileProvider.c(context, "com.teamviewer.chatviewlib.fileprovider", new File(strGetDownloadFilePath)), mimeTypeFromExtension);
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    ye4.a.g("ChatHelper", fx3.h("no activity found for ", strGetDownloadFilePath, " (", mimeTypeFromExtension, ")"));
                    return;
                }
                break;
            case 4:
                TextInputLayout textInputLayout = ((it0) obj).a;
                Editable text = textInputLayout.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
                textInputLayout.k(textInputLayout.t0, textInputLayout.v0);
                break;
            case 5:
                z62 z62Var = (z62) obj;
                z62Var.f((AutoCompleteTextView) z62Var.a.getEditText());
                break;
            case 6:
                pp4 itemData = ((d05) view).getItemData();
                g90 g90Var = (g90) obj;
                if (!g90Var.E.s(itemData, g90Var.D, 0)) {
                    itemData.setChecked(true);
                }
                break;
            case 7:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                h15 h15Var = (h15) obj;
                z05 z05Var = h15Var.q;
                if (z05Var != null) {
                    z05Var.e = true;
                }
                pp4 itemData2 = navigationMenuItemView.getItemData();
                boolean zS = h15Var.f941o.s(itemData2, h15Var, 0);
                if (itemData2 != null && itemData2.isCheckable() && zS) {
                    h15Var.q.i(itemData2);
                } else {
                    z = false;
                }
                z05 z05Var2 = h15Var.q;
                if (z05Var2 != null) {
                    z05Var2.e = false;
                }
                if (z) {
                    h15Var.c(false);
                }
                break;
            case 8:
                ug5 ug5Var = (ug5) obj;
                TextInputLayout textInputLayout2 = ug5Var.a;
                EditText editText = textInputLayout2.getEditText();
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    if (ug5Var.d()) {
                        editText.setTransformationMethod(null);
                    } else {
                        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        editText.setSelection(selectionEnd);
                    }
                    textInputLayout2.k(textInputLayout2.t0, textInputLayout2.v0);
                    break;
                }
                break;
            case ep1.b /* 9 */:
                ((Preference) obj).s(view);
                break;
            default:
                gz7 gz7Var = ((Toolbar) obj).b0;
                pp4 pp4Var = gz7Var != null ? gz7Var.n : null;
                if (pp4Var != null) {
                    pp4Var.collapseActionView();
                }
                break;
        }
    }
}
