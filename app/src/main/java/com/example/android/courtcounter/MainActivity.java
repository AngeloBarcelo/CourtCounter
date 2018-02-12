package com.example.android.courtcounter;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.android.courtcounter.databinding.ActivityMainBinding;

import static com.example.android.courtcounter.R.id.left_team_spinner;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener, AdapterView.OnItemSelectedListener {

    ActivityMainBinding binding;
    PointAssignment points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        points = new PointAssignment(0, 0);
        binding.setPointassignmment(points);
        binding.leftOnePointBtn.setOnLongClickListener(this);
        binding.leftTwoPointsBtn.setOnLongClickListener(this);
        binding.leftThreePointsBtn.setOnLongClickListener(this);
        binding.rightOnePointBtn.setOnLongClickListener(this);
        binding.rightTwoPointsBtn.setOnLongClickListener(this);
        binding.rightThreePointsBtn.setOnLongClickListener(this);
        binding.rightTeamSpinner.setOnItemSelectedListener(this);
        binding.leftTeamSpinner.setOnItemSelectedListener(this);

    }

    public void changPoints(View v) {
        points.addPoints(v.getId());
    }

    @Override
    public boolean onLongClick(View v) {

        //Validates number before calling method. Without it, method allows score to show negative numb
        if (v.getId() == R.id.leftOnePoint_btn && points.getCurrentScoreLeft() < 1) {
            Toast.makeText(getApplicationContext(), getString(R.string.reject_message), Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.leftTwoPoints_btn && points.getCurrentScoreLeft() < 2) {
            Toast.makeText(getApplicationContext(), getString(R.string.reject_message), Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.leftThreePoints_btn && points.getCurrentScoreLeft() < 3) {
            Toast.makeText(getApplicationContext(), getString(R.string.reject_message), Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.rightOnePoint_btn && points.getCurrentScoreRight() < 1) {
            Toast.makeText(getApplicationContext(), getString(R.string.reject_message), Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.rightTwoPoints_btn && points.getCurrentScoreRight() < 2) {
            Toast.makeText(getApplicationContext(), getString(R.string.reject_message), Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.rightThreePoints_btn && points.getCurrentScoreRight() < 3) {
            Toast.makeText(getApplicationContext(), getString(R.string.reject_message), Toast.LENGTH_SHORT).show();
        } else {
            points.subtractPoint(v.getId());
        }
        return true;
    }

    //Changes team logo based on spinner object.
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.left_team_spinner) {
            switch (position) {
                case 0:
                    binding.leftTeamLogo.setImageResource(R.drawable.basketball);
                    break;
                case 1:
                    binding.leftTeamLogo.setImageResource(R.drawable.basketball2);
                    break;
                case 2:
                    binding.leftTeamLogo.setImageResource(R.drawable.atlanta_logo);
                    break;
                case 3:
                    binding.leftTeamLogo.setImageResource(R.drawable.boston_logo);
                    break;
                case 4:
                    binding.leftTeamLogo.setImageResource(R.drawable.nets_logo);
                    break;
                case 5:
                    binding.leftTeamLogo.setImageResource(R.drawable.hornets_logo);
                    break;
                case 6:
                    binding.leftTeamLogo.setImageResource(R.drawable.chicago_logo);
                    break;
                case 7:
                    binding.leftTeamLogo.setImageResource(R.drawable.cav_logo);
                    break;
                case 8:
                    binding.leftTeamLogo.setImageResource(R.drawable.dallas_logo);
                    break;
                case 9:
                    binding.leftTeamLogo.setImageResource(R.drawable.nuggets_logo);
                    break;
                case 10:
                    binding.leftTeamLogo.setImageResource(R.drawable.pistons_logo);
                    break;
                case 11:
                    binding.leftTeamLogo.setImageResource(R.drawable.goldenstate_logo);
                    break;
                case 12:
                    binding.leftTeamLogo.setImageResource(R.drawable.houston_logo);
                    break;
                case 13:
                    binding.leftTeamLogo.setImageResource(R.drawable.portlan_logo);
                    break;
                case 14:
                    binding.leftTeamLogo.setImageResource(R.drawable.clippers_logo);
                    break;
                case 15:
                    binding.leftTeamLogo.setImageResource(R.drawable.la_logo);
                    break;
                case 16:
                    binding.leftTeamLogo.setImageResource(R.drawable.memphis_logo);
                    break;
                case 17:
                    binding.leftTeamLogo.setImageResource(R.drawable.miami_logo);
                    break;
                case 18:
                    binding.leftTeamLogo.setImageResource(R.drawable.bucks_logo);
                    break;
                case 19:
                    binding.leftTeamLogo.setImageResource(R.drawable.timberwolves_logo);
                    break;
                case 20:
                    binding.leftTeamLogo.setImageResource(R.drawable.pelicans_logo);
                    break;
                case 21:
                    binding.leftTeamLogo.setImageResource(R.drawable.ny_logo);
                    break;
                case 22:
                    binding.leftTeamLogo.setImageResource(R.drawable.okc_logo);
                    break;
                case 23:
                    binding.leftTeamLogo.setImageResource(R.drawable.orlando_logo);
                    break;
                case 24:
                    binding.leftTeamLogo.setImageResource(R.drawable.philidelphea_logo);
                    break;
                case 25:
                    binding.leftTeamLogo.setImageResource(R.drawable.phoenix_logo);
                    break;
                case 26:
                    binding.leftTeamLogo.setImageResource(R.drawable.portlan_logo);
                    break;
                case 27:
                    binding.leftTeamLogo.setImageResource(R.drawable.kings_logo);
                    break;
                case 28:
                    binding.leftTeamLogo.setImageResource(R.drawable.sanantonio_logo);
                    break;
                case 29:
                    binding.leftTeamLogo.setImageResource(R.drawable.toronto_logo);
                    break;
                case 30:
                    binding.leftTeamLogo.setImageResource(R.drawable.jazz_logo);
                    break;
                case 31:
                    binding.leftTeamLogo.setImageResource(R.drawable.wizards_logo);
                    break;
            }
        } else {
            switch (position) {
                case 0:
                    binding.rightTeamLogo.setImageResource(R.drawable.basketball);
                    break;
                case 1:
                    binding.rightTeamLogo.setImageResource(R.drawable.basketball2);
                    break;
                case 2:
                    binding.rightTeamLogo.setImageResource(R.drawable.atlanta_logo);
                    break;
                case 3:
                    binding.rightTeamLogo.setImageResource(R.drawable.boston_logo);
                    break;
                case 4:
                    binding.rightTeamLogo.setImageResource(R.drawable.nets_logo);
                    break;
                case 5:
                    binding.rightTeamLogo.setImageResource(R.drawable.hornets_logo);
                    break;
                case 6:
                    binding.rightTeamLogo.setImageResource(R.drawable.chicago_logo);
                    break;
                case 7:
                    binding.rightTeamLogo.setImageResource(R.drawable.cav_logo);
                    break;
                case 8:
                    binding.rightTeamLogo.setImageResource(R.drawable.dallas_logo);
                    break;
                case 9:
                    binding.rightTeamLogo.setImageResource(R.drawable.nuggets_logo);
                    break;
                case 10:
                    binding.rightTeamLogo.setImageResource(R.drawable.pistons_logo);
                    break;
                case 11:
                    binding.rightTeamLogo.setImageResource(R.drawable.goldenstate_logo);
                    break;
                case 12:
                    binding.rightTeamLogo.setImageResource(R.drawable.houston_logo);
                    break;
                case 13:
                    binding.rightTeamLogo.setImageResource(R.drawable.portlan_logo);
                    break;
                case 14:
                    binding.rightTeamLogo.setImageResource(R.drawable.clippers_logo);
                    break;
                case 15:
                    binding.rightTeamLogo.setImageResource(R.drawable.la_logo);
                    break;
                case 16:
                    binding.rightTeamLogo.setImageResource(R.drawable.memphis_logo);
                    break;
                case 17:
                    binding.rightTeamLogo.setImageResource(R.drawable.miami_logo);
                    break;
                case 18:
                    binding.rightTeamLogo.setImageResource(R.drawable.bucks_logo);
                    break;
                case 19:
                    binding.rightTeamLogo.setImageResource(R.drawable.timberwolves_logo);
                    break;
                case 20:
                    binding.rightTeamLogo.setImageResource(R.drawable.pelicans_logo);
                    break;
                case 21:
                    binding.rightTeamLogo.setImageResource(R.drawable.ny_logo);
                    break;
                case 22:
                    binding.rightTeamLogo.setImageResource(R.drawable.okc_logo);
                    break;
                case 23:
                    binding.rightTeamLogo.setImageResource(R.drawable.orlando_logo);
                    break;
                case 24:
                    binding.rightTeamLogo.setImageResource(R.drawable.philidelphea_logo);
                    break;
                case 25:
                    binding.rightTeamLogo.setImageResource(R.drawable.phoenix_logo);
                    break;
                case 26:
                    binding.rightTeamLogo.setImageResource(R.drawable.portlan_logo);
                    break;
                case 27:
                    binding.rightTeamLogo.setImageResource(R.drawable.kings_logo);
                    break;
                case 28:
                    binding.rightTeamLogo.setImageResource(R.drawable.sanantonio_logo);
                    break;
                case 29:
                    binding.rightTeamLogo.setImageResource(R.drawable.toronto_logo);
                    break;
                case 30:
                    binding.rightTeamLogo.setImageResource(R.drawable.jazz_logo);
                    break;
                case 31:
                    binding.rightTeamLogo.setImageResource(R.drawable.wizards_logo);
                    break;
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        binding.leftTeamLogo.setImageResource(R.drawable.basketball);
    }
}
