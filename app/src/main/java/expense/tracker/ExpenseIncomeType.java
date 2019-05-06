package expense.tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ExpenseIncomeType extends AppCompatActivity implements View.OnClickListener{

    Button income;
    Button expense;
    LinearLayout expenseTypes;
    LinearLayout incomeTypes;

    LinearLayout salaryIncome;
    LinearLayout businessIncome;
    LinearLayout giftIncome;
    LinearLayout loanIncome;
    LinearLayout taxReturnIncome;
    LinearLayout otherIncome;

    LinearLayout foodExpense;
    LinearLayout clothingExpense;
    LinearLayout transportExpense;
    LinearLayout billExpense;
    LinearLayout entertainExpense;
    LinearLayout travelExpense;
    LinearLayout groceryExpense;
    LinearLayout hobbyExpense;
    LinearLayout workExpense;
    LinearLayout giftExpense;
    LinearLayout maintenanceExpense;
    LinearLayout otherExpense;
    boolean currentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_income_type);

        currentPage = false; //false = income, true = expense
        income = findViewById(R.id.incomeButton);
        income.setOnClickListener(this);
        expense = findViewById(R.id.expenseButton);
        expense.setOnClickListener(this);
        expenseTypes = findViewById(R.id.expensePage);
        incomeTypes = findViewById(R.id.incomePage);



    }

    @Override
    public void onClick(View v) {
        if(v.getId() == income.getId())
        {
            expenseTypes.setVisibility(View.GONE);
            incomeTypes.setVisibility(View.VISIBLE);
        }

        if(v.getId() == expense.getId())
        {
            incomeTypes.setVisibility(View.GONE);
            expenseTypes.setVisibility(View.VISIBLE);
        }

        if(!currentPage)
            switch (v.getId())
            {
                case R.id.salaryIncome:

                    break;

                case R.id.businessIncome:

                    break;

                case R.id.giftIncome:

                    break;

                case R.id.loanIncome:

                    break;

                case R.id.taxIncome:

                    break;

                case R.id.otherIncome:

                    break;

            }

        if (currentPage)
            switch (v.getId())
            {
                case R.id.foodExpense:

                    break;

                case R.id.clothingExpense:

                    break;

                case R.id.transportExpense:

                    break;

                case R.id.entertainmentExpense:

                    break;

                case R.id.billsExpense:

                    break;

                case R.id.travelExpense:

                    break;

                case R.id.groceryExpense:

                    break;

                case R.id.hobbyExpense:

                    break;

                case R.id.workExpense:

                    break;

                case R.id.giftExpense:

                    break;

                case R.id.maintenanceExpense:

                    break;

                case R.id.otherExpense:

                    break;
            }
    }
}
