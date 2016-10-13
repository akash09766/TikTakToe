package com.skylightdeveloper.tiktaktoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mBut11, mBut12, mBut13;
    private Button mBut21, mBut22, mBut23;
    private Button mBut31, mBut32, mBut33;

    private boolean mIsFirstPlayerTurn = true;

    private int mClicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setIdstoViews();
        setListernersToviews();
    }

    private void setIdstoViews() {

        mBut11 = (Button) findViewById(R.id.but_11_id);
        mBut12 = (Button) findViewById(R.id.but_12_id);
        mBut13 = (Button) findViewById(R.id.but_13_id);


        mBut21 = (Button) findViewById(R.id.but_21_id);
        mBut22 = (Button) findViewById(R.id.but_22_id);
        mBut23 = (Button) findViewById(R.id.but_23_id);


        mBut31 = (Button) findViewById(R.id.but_31_id);
        mBut32 = (Button) findViewById(R.id.but_32_id);
        mBut33 = (Button) findViewById(R.id.but_33_id);
    }

    private void setListernersToviews() {

        mBut11.setOnClickListener(this);
        mBut12.setOnClickListener(this);
        mBut13.setOnClickListener(this);

        mBut21.setOnClickListener(this);
        mBut22.setOnClickListener(this);
        mBut23.setOnClickListener(this);

        mBut31.setOnClickListener(this);
        mBut32.setOnClickListener(this);
        mBut33.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        mClicks++;
        switch (view.getId()) {

            //1 phase -------------------------------------

            case R.id.but_11_id:

                if (mIsFirstPlayerTurn) {
                    mBut11.setBackground(ContextCompat.getDrawable(this, R.drawable.right));
                    mBut11.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = false;
                } else {
                    mBut11.setBackground(ContextCompat.getDrawable(this, R.drawable.wrong));
                    mBut11.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = true;
                }
                mBut11.setSelected(true);
                mBut11.setClickable(false);
                getResults(view.getId());
                break;

            case R.id.but_12_id:

                if (mIsFirstPlayerTurn) {
                    mBut12.setBackground(ContextCompat.getDrawable(this, R.drawable.right));
                    mBut12.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = false;
                } else {
                    mBut12.setBackground(ContextCompat.getDrawable(this, R.drawable.wrong));
                    mBut12.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = true;
                }
                mBut12.setSelected(true);
                mBut12.setClickable(false);
                getResults(view.getId());
                break;

            case R.id.but_13_id:

                if (mIsFirstPlayerTurn) {
                    mBut13.setBackground(ContextCompat.getDrawable(this, R.drawable.right));
                    mBut13.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = false;
                } else {
                    mBut13.setBackground(ContextCompat.getDrawable(this, R.drawable.wrong));
                    mBut13.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = true;
                }
                mBut13.setSelected(true);
                mBut13.setClickable(false);
                getResults(view.getId());
                break;

            //2 phase -------------------------------------

            case R.id.but_21_id:

                if (mIsFirstPlayerTurn) {
                    mBut21.setBackground(ContextCompat.getDrawable(this, R.drawable.right));
                    mBut21.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = false;
                } else {
                    mBut21.setBackground(ContextCompat.getDrawable(this, R.drawable.wrong));
                    mBut21.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = true;
                }
                mBut21.setSelected(true);
                mBut21.setClickable(false);
                getResults(view.getId());
                break;

            case R.id.but_22_id:

                if (mIsFirstPlayerTurn) {
                    mBut22.setBackground(ContextCompat.getDrawable(this, R.drawable.right));
                    mBut22.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = false;
                } else {
                    mBut22.setBackground(ContextCompat.getDrawable(this, R.drawable.wrong));
                    mBut22.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = true;
                }
                mBut22.setSelected(true);
                mBut22.setClickable(false);
                getResults(view.getId());
                break;

            case R.id.but_23_id:

                if (mIsFirstPlayerTurn) {
                    mBut23.setBackground(ContextCompat.getDrawable(this, R.drawable.right));
                    mBut23.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = false;
                } else {
                    mBut23.setBackground(ContextCompat.getDrawable(this, R.drawable.wrong));
                    mBut23.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = true;
                }
                mBut23.setSelected(true);
                mBut23.setClickable(false);
                getResults(view.getId());
                break;

            //3 phase -------------------------------------

            case R.id.but_31_id:

                if (mIsFirstPlayerTurn) {
                    mBut31.setBackground(ContextCompat.getDrawable(this, R.drawable.right));
                    mBut31.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = false;
                } else {
                    mBut31.setBackground(ContextCompat.getDrawable(this, R.drawable.wrong));
                    mBut31.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = true;
                }
                mBut31.setSelected(true);
                mBut31.setClickable(false);
                getResults(view.getId());
                break;

            case R.id.but_32_id:

                if (mIsFirstPlayerTurn) {
                    mBut32.setBackground(ContextCompat.getDrawable(this, R.drawable.right));
                    mBut32.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = false;
                } else {
                    mBut32.setBackground(ContextCompat.getDrawable(this, R.drawable.wrong));
                    mBut32.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = true;
                }
                mBut32.setSelected(true);
                mBut32.setClickable(false);
                getResults(view.getId());
                break;

            case R.id.but_33_id:

                if (mIsFirstPlayerTurn) {
                    mBut33.setBackground(ContextCompat.getDrawable(this, R.drawable.right));
                    mBut33.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = false;
                } else {
                    mBut33.setBackground(ContextCompat.getDrawable(this, R.drawable.wrong));
                    mBut33.setTag(mIsFirstPlayerTurn);
                    mIsFirstPlayerTurn = true;
                }
                mBut33.setSelected(true);
                mBut33.setClickable(false);
                getResults(view.getId());
                break;
        }

    }

    private void getResults(int id) {


        Log.d(TAG, "getResults: clicks = " + mClicks);
        if (mClicks < 5) {
            return;        // optimisation
        }


        if (mBut11.isSelected() && mBut12.isSelected() && mBut13.isSelected()) {

            if ((boolean) mBut11.getTag() && (boolean) mBut12.getTag() && (boolean) mBut13.getTag()) {
                showToast(1);
                return;

            } else if ((!(boolean) mBut11.getTag() && !(boolean) mBut12.getTag() &&
                    !(boolean) mBut13.getTag())) {
                showToast(2);
                return;
            }

        }
        if (mBut21.isSelected() && mBut22.isSelected() && mBut23.isSelected()) {

            if ((boolean) mBut21.getTag() && (boolean) mBut22.getTag() && (boolean) mBut23.getTag()) {
                showToast(1);
                return;
            } else if ((!(boolean) mBut21.getTag() && !(boolean) mBut22.getTag() &&
                    !(boolean) mBut23.getTag())) {
                showToast(2);
                return;
            }

        }
        if (mBut31.isSelected() && mBut32.isSelected() && mBut33.isSelected()) {

            if ((boolean) mBut31.getTag() && (boolean) mBut32.getTag() && (boolean) mBut33.getTag()) {
                showToast(1);
                return;
            } else if ((!(boolean) mBut31.getTag() && !(boolean) mBut32.getTag() &&
                    !(boolean) mBut33.getTag())) {
                showToast(2);
                return;
            }

        }
        if (mBut11.isSelected() && mBut21.isSelected() && mBut31.isSelected()) {

            if ((boolean) mBut11.getTag() && (boolean) mBut21.getTag() && (boolean) mBut31.getTag()) {
                showToast(1);
                return;
            } else if ((!(boolean) mBut11.getTag() && !(boolean) mBut21.getTag() &&
                    !(boolean) mBut31.getTag())) {
                showToast(2);
                return;
            }

        }
        if (mBut12.isSelected() && mBut22.isSelected() && mBut32.isSelected()) {

            if ((boolean) mBut12.getTag() && (boolean) mBut22.getTag() && (boolean) mBut32.getTag()) {
                showToast(1);
                return;
            } else if ((!(boolean) mBut12.getTag() && !(boolean) mBut22.getTag() &&
                    !(boolean) mBut32.getTag())) {
                showToast(2);
                return;
            }

        }
        if (mBut13.isSelected() && mBut23.isSelected() && mBut33.isSelected()) {

            if ((boolean) mBut13.getTag() && (boolean) mBut23.getTag() && (boolean) mBut33.getTag()) {
                showToast(1);
                return;
            } else if ((!(boolean) mBut13.getTag() && !(boolean) mBut23.getTag() &&
                    !(boolean) mBut33.getTag())) {
                showToast(2);
                return;
            }

        }
        if (mBut11.isSelected() && mBut22.isSelected() && mBut33.isSelected()) {

            if ((boolean) mBut11.getTag() && (boolean) mBut22.getTag() && (boolean) mBut33.getTag()) {
                showToast(1);
                return;
            } else if ((!(boolean) mBut11.getTag() && !(boolean) mBut22.getTag() &&
                    !(boolean) mBut33.getTag())) {
                showToast(2);
                return;
            }

        }
        if (mBut13.isSelected() && mBut22.isSelected() && mBut31.isSelected()) {

            if ((boolean) mBut13.getTag() && (boolean) mBut22.getTag() && (boolean) mBut31.getTag()) {
                showToast(1);
                return;
            } else if ((!(boolean) mBut13.getTag() && !(boolean) mBut22.getTag() &&
                    !(boolean) mBut31.getTag())) {
                showToast(2);
                return;
            }
        }
    }

    private void showToast(int whichUser) {

        if (whichUser == 1) {
            Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show();
            restartDialog();
        } else if (whichUser == 2) {
            Toast.makeText(this, "Player 2 win", Toast.LENGTH_SHORT).show();
            restartDialog();
        }

    }

    private void restartDialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(getString(R.string.game_over));
        alert.setMessage(getString(R.string.play_again_msg));
        alert.setPositiveButton(getString(R.string.dialog_ok),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        doRestart();
                    }
                }
        );
        alert.setNegativeButton(getString(R.string.dialog_cancel),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        dialog.dismiss();
                    }
                }
        );
        AlertDialog dialog = alert.create();
        dialog.show();

        Button cancelBtn = dialog.getButton(DialogInterface.BUTTON_NEGATIVE);
        cancelBtn.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        Button okBtn = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
        okBtn.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
    }

    private void doRestart() {
        Intent restartIntent = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        restartIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(restartIntent);
    }
}
