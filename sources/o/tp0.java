package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.format.Formatter;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.teamviewer.avatarlib.view.RoundAvatarImageView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatMessageID;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IRemoteFileMessageUIModel;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.IOException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class tp0 extends b0 {
    public static final /* synthetic */ int Q = 0;
    public final boolean I;
    public final RoundAvatarImageView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public final TextView O;
    public final RotateAnimation P;

    public tp0(View view, boolean z) {
        super(view, 2);
        this.I = z;
        View viewFindViewById = view.findViewById(R.id.chat_account_avatar);
        viewFindViewById.getClass();
        RoundAvatarImageView roundAvatarImageView = (RoundAvatarImageView) viewFindViewById;
        this.J = roundAvatarImageView;
        View viewFindViewById2 = view.findViewById(R.id.chat_group_partner_name);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.K = textView;
        View viewFindViewById3 = view.findViewById(R.id.chat_message_incoming);
        viewFindViewById3.getClass();
        this.L = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.chat_message_thumbnail);
        viewFindViewById4.getClass();
        this.M = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.chat_message_thumbnail_overlay);
        viewFindViewById5.getClass();
        this.N = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.chat_incoming_timestamp);
        viewFindViewById6.getClass();
        this.O = (TextView) viewFindViewById6;
        if (!z) {
            textView.setVisibility(4);
            roundAvatarImageView.setVisibility(4);
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.P = rotateAnimation;
        rotateAnimation.setDuration(500L);
        rotateAnimation.setRepeatCount(-1);
    }

    @Override // o.b0
    public final Object r(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        return ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetRemoteFileMessageById(chatConversationID, chatMessageID);
    }

    @Override // o.b0
    public final void s(Object obj, boolean z) throws IOException {
        final IRemoteFileMessageUIModel iRemoteFileMessageUIModel = (IRemoteFileMessageUIModel) obj;
        SimpleDateFormat simpleDateFormat = rp0.a;
        iRemoteFileMessageUIModel.getClass();
        this.O.setText(rp0.a(iRemoteFileMessageUIModel.GetTimestamp()));
        String strGetFileName = iRemoteFileMessageUIModel.GetFileName();
        View view = this.m;
        this.L.setText(vb7.C("\n            " + strGetFileName + "\n            " + Formatter.formatShortFileSize(view.getContext(), iRemoteFileMessageUIModel.GetFileSize().longValue()) + "\n        "));
        String strGetFileName2 = iRemoteFileMessageUIModel.GetFileName();
        ImageView imageView = this.M;
        imageView.setContentDescription(strGetFileName2);
        final byte b = 0;
        if (iRemoteFileMessageUIModel.HasThumbnail()) {
            byte[] bArrGetThumbnailData = iRemoteFileMessageUIModel.GetThumbnailData();
            bArrGetThumbnailData.getClass();
            if (bArrGetThumbnailData.length == 0) {
                iRemoteFileMessageUIModel.DownloadThumbnail();
            } else {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrGetThumbnailData, 0, bArrGetThumbnailData.length);
                if (bitmapDecodeByteArray != null) {
                    imageView.setImageBitmap(bitmapDecodeByteArray);
                }
            }
            imageView.setImageResource(R.drawable.file_thumbnail_placeholder);
        } else {
            imageView.setImageResource(R.drawable.file_thumbnail_placeholder);
        }
        boolean zIsDownloadReady = iRemoteFileMessageUIModel.IsDownloadReady();
        RotateAnimation rotateAnimation = this.P;
        ImageView imageView2 = this.N;
        if (zIsDownloadReady) {
            rotateAnimation.cancel();
            imageView2.setImageDrawable(view.getContext().getDrawable(R.drawable.ic_open_in_new_white_40dp));
            imageView.setOnClickListener(new o6(iRemoteFileMessageUIModel, (byte) 3));
        } else if (iRemoteFileMessageUIModel.IsDownloading()) {
            imageView2.setImageDrawable(view.getContext().getDrawable(R.drawable.ic_autorenew_white_40dp));
            if (imageView2.getAnimation() == null) {
                imageView2.startAnimation(rotateAnimation);
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.sp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b2 = b;
                    IRemoteFileMessageUIModel iRemoteFileMessageUIModel2 = iRemoteFileMessageUIModel;
                    switch (b2) {
                        case 0:
                            iRemoteFileMessageUIModel2.CancelDownload();
                            break;
                        default:
                            iRemoteFileMessageUIModel2.DownloadFile();
                            break;
                    }
                }
            });
        } else {
            rotateAnimation.cancel();
            imageView2.setImageDrawable(view.getContext().getDrawable(R.drawable.ic_file_download_white_40dp));
            final byte b2 = 1;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.sp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b3 = b2;
                    IRemoteFileMessageUIModel iRemoteFileMessageUIModel2 = iRemoteFileMessageUIModel;
                    switch (b3) {
                        case 0:
                            iRemoteFileMessageUIModel2.CancelDownload();
                            break;
                        default:
                            iRemoteFileMessageUIModel2.DownloadFile();
                            break;
                    }
                }
            });
        }
        if (this.I) {
            TextView textView = this.K;
            textView.setVisibility(0);
            textView.setText(iRemoteFileMessageUIModel.GetDisplayName());
            RoundAvatarImageView roundAvatarImageView = this.J;
            roundAvatarImageView.setVisibility(0);
            roundAvatarImageView.d(iRemoteFileMessageUIModel.GetAccountPictureUrl(), z);
        }
    }

    @Override // o.b0
    public final void t(Object obj, VoidSignalCallback[] voidSignalCallbackArr) {
        IRemoteFileMessageUIModel iRemoteFileMessageUIModel = (IRemoteFileMessageUIModel) obj;
        ChatSignalsHelper.RegisterRemoteFileMessageChangedSlot(iRemoteFileMessageUIModel, voidSignalCallbackArr[0]);
        ChatSignalsHelper.RegisterRemoteFileMessageChangedSlot2(iRemoteFileMessageUIModel, voidSignalCallbackArr[1]);
    }
}
