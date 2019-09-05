package com.mycompany.creditscorecalculator;
import javax.swing.JOptionPane;

public class CreditScoreCalc extends javax.swing.JFrame {
    //initialize variables to utilized below 
    double combinedIncome, combinedDebt, loanToIncomeRatio, income, monthlyDebt;
    double spouseIncome, spouseMonthlydebt, loanIncomeRatio, annualInterestRate;
    double loanAmount, costOfNewCar, costOfOldCar, monthlyPayment, downPayment;
    int creditScore, spouseCreditScore, avgCreditScore;
    int month, day, year, yearsOfLoan;

    public CreditScoreCalc() {
        initComponents();
        removeLbls(); //removes labels that dont need to be shown at launch                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DD = new javax.swing.JPanel();
        creditScoreCalculatorLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        monthTextField = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ssnLbl = new javax.swing.JLabel();
        ssnTextField = new javax.swing.JTextField();
        customerInfolbl = new javax.swing.JLabel();
        spouceInfoLbl = new javax.swing.JLabel();
        spouseNamelbl = new javax.swing.JLabel();
        spouseNameTextField = new javax.swing.JTextField();
        spouseSsnTextField = new javax.swing.JTextField();
        spouseSsnLbl = new javax.swing.JLabel();
        monthlyIncomeLbl = new javax.swing.JLabel();
        spouseLbl = new javax.swing.JLabel();
        incomeLbl = new javax.swing.JLabel();
        incomeTextField = new javax.swing.JTextField();
        spouseIncomeTextField = new javax.swing.JTextField();
        monthlyPaymentInfoLbl = new javax.swing.JLabel();
        debtLbl = new javax.swing.JLabel();
        paymentTextField = new javax.swing.JTextField();
        spouseDebtLbl = new javax.swing.JLabel();
        spouseMonthlyPaymentTextField = new javax.swing.JTextField();
        carInfoLbl = new javax.swing.JLabel();
        tradeInValueLbl = new javax.swing.JLabel();
        newCarCostLbl = new javax.swing.JLabel();
        downPaymentLbl = new javax.swing.JLabel();
        creditScoreLbl = new javax.swing.JLabel();
        loanTimeLbl = new javax.swing.JLabel();
        tradeInTextField = new javax.swing.JTextField();
        downPaymentTextField = new javax.swing.JTextField();
        newCarCostTextField = new javax.swing.JTextField();
        loanYearsTextField = new javax.swing.JTextField();
        creditScoreTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        submitInstructionLbl = new javax.swing.JLabel();
        combinedIncomeLbl = new javax.swing.JLabel();
        combinedDebtLbl = new javax.swing.JLabel();
        loanPaymentToIncomeRatioLbl = new javax.swing.JLabel();
        annualInterestRateLbl = new javax.swing.JLabel();
        combinedIncomeDisplayLbl = new javax.swing.JLabel();
        combinedDebtDisplayLbl = new javax.swing.JLabel();
        loanPaymentToIncomeRatioDisplayLbl = new javax.swing.JLabel();
        annualInterestRateDisplayLbl = new javax.swing.JLabel();
        loanAmountLbl = new javax.swing.JLabel();
        loanAmountDisplayLbl = new javax.swing.JLabel();
        monthlyPaymentLbl = new javax.swing.JLabel();
        monthlyPaymentDisplayLbl = new javax.swing.JLabel();
        dateOfLastPaymentLbl = new javax.swing.JLabel();
        dateOfLastPaymentDisplayLbl = new javax.swing.JLabel();
        spouseCreditScoreLbl = new javax.swing.JLabel();
        spouseCreditScoreTextField = new javax.swing.JTextField();
        dayTextField = new javax.swing.JTextField();
        yearTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DD.setBackground(new java.awt.Color(204, 204, 204));
        DD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        creditScoreCalculatorLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        creditScoreCalculatorLbl.setText("                                                                                                                     Credit Score Calculator");
        creditScoreCalculatorLbl.setToolTipText("");

        dateLbl.setText("Date:");

        monthTextField.setText("MM");

        nameLbl.setText("Name");

        ssnLbl.setText("SSN:");

        customerInfolbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        customerInfolbl.setText("Enter your information below:");

        spouceInfoLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        spouceInfoLbl.setText("Enter spouse information Below if applicable:");

        spouseNamelbl.setText("Spouse Name:");

        spouseSsnLbl.setText("Spouse SSN:");

        monthlyIncomeLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        monthlyIncomeLbl.setText("                                                                                                       Monthly Income Information");
        monthlyIncomeLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        spouseLbl.setText("Spouse Income:");

        incomeLbl.setText("Customer Income:");

        incomeTextField.setText("0");

        spouseIncomeTextField.setText("0");

        monthlyPaymentInfoLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        monthlyPaymentInfoLbl.setText("                                                                                                               Monthly payments ");
        monthlyPaymentInfoLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        debtLbl.setText("Bill monthly debpt:");

        paymentTextField.setText("0");

        spouseDebtLbl.setText("Spouse monthly debt:");

        spouseMonthlyPaymentTextField.setText("0");

        carInfoLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        carInfoLbl.setText("                                                                                             Car info");
        carInfoLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tradeInValueLbl.setText("Trade in car value:");

        newCarCostLbl.setText("Cost of new car:");

        downPaymentLbl.setText("Down payment:");

        creditScoreLbl.setText("Credit Score:");

        loanTimeLbl.setText("Years to payoff Loan:");

        tradeInTextField.setText("0");

        downPaymentTextField.setText("0");

        newCarCostTextField.setText("0");

        loanYearsTextField.setText("0");

        creditScoreTextField.setText("0");

        submitButton.setText("Submit");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });

        submitInstructionLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submitInstructionLbl.setText("Press submit once all information has been entered to display results below");
        submitInstructionLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        combinedIncomeLbl.setText("Combined Income : ");

        combinedDebtLbl.setText("Combined Debt :");

        loanPaymentToIncomeRatioLbl.setText("Payment to Income Ratio :   ");

        annualInterestRateLbl.setText("Annual Interest Rate");

        loanAmountLbl.setText("Loan Amount");

        monthlyPaymentLbl.setText("Monthly Payment");

        dateOfLastPaymentLbl.setText("Date of Last Payment: ");

        spouseCreditScoreLbl.setText("Spouse Credit Score");

        spouseCreditScoreTextField.setText("0");

        dayTextField.setText("DD");

        yearTextField.setText("YYYY");

        javax.swing.GroupLayout DDLayout = new javax.swing.GroupLayout(DD);
        DD.setLayout(DDLayout);
        DDLayout.setHorizontalGroup(
            DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(creditScoreCalculatorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DDLayout.createSequentialGroup()
                .addComponent(submitInstructionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(DDLayout.createSequentialGroup()
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carInfoLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monthlyIncomeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monthlyPaymentInfoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DDLayout.createSequentialGroup()
                        .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DDLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(incomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(incomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DDLayout.createSequentialGroup()
                                .addComponent(debtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DDLayout.createSequentialGroup()
                                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ssnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ssnTextField)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                .addGap(186, 186, 186)
                                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DDLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spouseSsnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spouseNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spouseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spouseSsnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(DDLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(spouceInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(customerInfolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DDLayout.createSequentialGroup()
                                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DDLayout.createSequentialGroup()
                                        .addComponent(tradeInValueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tradeInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(downPaymentLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DDLayout.createSequentialGroup()
                                        .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(DDLayout.createSequentialGroup()
                                                .addComponent(creditScoreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(creditScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(DDLayout.createSequentialGroup()
                                                .addComponent(newCarCostLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(newCarCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(loanTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spouseCreditScoreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(downPaymentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(spouseCreditScoreTextField)
                                    .addComponent(loanYearsTextField))))
                        .addGap(0, 155, Short.MAX_VALUE))
                    .addGroup(DDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DDLayout.createSequentialGroup()
                                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DDLayout.createSequentialGroup()
                                        .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(combinedDebtLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(combinedIncomeLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                                        .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combinedIncomeDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combinedDebtDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loanPaymentToIncomeRatioDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(annualInterestRateDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(84, 84, 84))
                                    .addGroup(DDLayout.createSequentialGroup()
                                        .addComponent(loanPaymentToIncomeRatioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(DDLayout.createSequentialGroup()
                                        .addComponent(loanAmountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DDLayout.createSequentialGroup()
                                        .addComponent(monthlyPaymentLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DDLayout.createSequentialGroup()
                                        .addComponent(dateOfLastPaymentLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateOfLastPaymentDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loanAmountDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthlyPaymentDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DDLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DDLayout.createSequentialGroup()
                                        .addComponent(spouseDebtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spouseMonthlyPaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DDLayout.createSequentialGroup()
                                        .addComponent(spouseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(spouseIncomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(DDLayout.createSequentialGroup()
                                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(annualInterestRateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(DDLayout.createSequentialGroup()
                                        .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        DDLayout.setVerticalGroup(
            DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DDLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(creditScoreCalculatorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(monthTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(yearTextField)
                    .addComponent(dayTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerInfolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spouceInfoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spouseNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spouseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnTextField)
                    .addComponent(spouseSsnLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spouseSsnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthlyIncomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spouseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spouseIncomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(incomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(incomeTextField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthlyPaymentInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(debtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spouseMonthlyPaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spouseDebtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tradeInValueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tradeInTextField)
                    .addComponent(downPaymentLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downPaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newCarCostLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCarCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanYearsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditScoreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spouseCreditScoreLbl)
                    .addComponent(spouseCreditScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitInstructionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton))
                .addGap(18, 18, 18)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combinedIncomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combinedIncomeDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanAmountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanAmountDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthlyPaymentDisplayLbl)
                    .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combinedDebtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combinedDebtDisplayLbl)
                        .addComponent(monthlyPaymentLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loanPaymentToIncomeRatioDisplayLbl)
                    .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loanPaymentToIncomeRatioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateOfLastPaymentLbl)
                        .addComponent(dateOfLastPaymentDisplayLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(annualInterestRateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(annualInterestRateDisplayLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(241, 241, 241))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //calculate averageCreditScore by averaging spouse and customer credit score
    public void CalculateCreditScore() {
        spouseCreditScore = Integer.parseInt(spouseCreditScoreTextField.getText());
        creditScore = Integer.parseInt(creditScoreTextField.getText());
        avgCreditScore = (spouseCreditScore + creditScore) / 2;
    }

    //calculate income by adding customer income and spouse income
    private void CalculateIncome() {
        //initialize values to what the inputs are in the text fields
        income = Double.parseDouble(incomeTextField.getText());
        spouseIncome = Double.parseDouble(spouseIncomeTextField.getText());
        combinedIncome = income + spouseIncome;
    }

    //calculate combined debt of customer and spouse
    private void CalculateDebt() {
        monthlyDebt = Double.parseDouble(paymentTextField.getText());
        spouseMonthlydebt = Double.parseDouble(spouseMonthlyPaymentTextField.getText());
        combinedDebt = monthlyDebt + spouseMonthlydebt; 
    }

    //calculate loan of car by subtracting car cost with trade in
    private void CalculateLoanAmount() {
        downPayment = Double.parseDouble(downPaymentTextField.getText());
        costOfOldCar = Double.parseDouble(tradeInTextField.getText());
        costOfNewCar = Double.parseDouble(newCarCostTextField.getText());
        loanAmount = costOfNewCar - costOfOldCar - downPayment;
    }

    //get dates of starting sale from input
    private void getDate() {
        month = Integer.parseInt(monthTextField.getText().toString());
        day = Integer.parseInt(dayTextField.getText().toString());
        year = Integer.parseInt(yearTextField.getText().toString());
    }

    //display all loan information once everything has been entered
    public void DisplayLoanInformation() {
        combinedIncomeDisplayLbl.setText(String.valueOf(combinedIncome));
        combinedDebtDisplayLbl.setText(String.valueOf(combinedDebt));
        loanPaymentToIncomeRatioDisplayLbl.setText(String.valueOf(loanIncomeRatio));
        monthlyPaymentDisplayLbl.setText(String.valueOf(monthlyPayment));
        dateOfLastPaymentDisplayLbl.setText(String.valueOf((month + 1) % 12) + "/" + String.valueOf(1) + "/" + String.valueOf(year + yearsOfLoan));
        loanAmountDisplayLbl.setText(String.valueOf(loanAmount));//
        annualInterestRateDisplayLbl.setText(String.valueOf(annualInterestRate));
    }
    //given information provided by user calculates loanIncomeRation to determine annual Interest rate
    private void CalculateInterestRate(){
        loanIncomeRatio = (combinedDebt / combinedIncome);//calc ration
        annualInterestRate = loanIncomeRatio * .1;//calc interest
    }
    //calculate monthly car payment by taking in all information provided by user
    private void CalculateMonthlyPayment(){
        yearsOfLoan = Integer.parseInt(loanYearsTextField.getText());//set years of loan
        double numeratorExponent = 12 * yearsOfLoan - (day / 365 * yearsOfLoan);//value for equation
        double denomenatorExponent = 12 * yearsOfLoan;//value for equation
        monthlyPayment = loanAmount * annualInterestRate * Math.pow(1 + (annualInterestRate / 12), numeratorExponent) / (12 * Math.pow(1 + annualInterestRate / 12, denomenatorExponent) - 12);  
    }
    //calls all information one submit button is pressed
    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        CalculateCreditScore();
        CalculateIncome();
        CalculateDebt();
        getDate();
        CalculateInterestRate();
        CalculateLoanAmount();//call function
        CalculateMonthlyPayment();

        if (avgCreditScore >= 500) {//test to see if avg score is >=500
            addLbls();//add hidden labels
            DisplayLoanInformation();//display all loan info
        } else {//if avg score <500 
            JOptionPane.showMessageDialog(null,//output
                    "credit score too low: Loan is denied");
            System.exit(0);//close program since credit is too low
        }
    }//GEN-LAST:event_submitButtonMouseClicked

    //removes all labels from being visible at the begining of the program
    private void removeLbls() {
        combinedIncomeLbl.setVisible(false);
        combinedIncomeDisplayLbl.setVisible(false);
        combinedDebtLbl.setVisible(false);
        combinedDebtDisplayLbl.setVisible(false);
        loanPaymentToIncomeRatioLbl.setVisible(false);
        loanPaymentToIncomeRatioDisplayLbl.setVisible(false);
        annualInterestRateLbl.setVisible(false);
        annualInterestRateDisplayLbl.setVisible(false);
        loanAmountLbl.setVisible(false);
        loanAmountDisplayLbl.setVisible(false);
        monthlyPaymentLbl.setVisible(false);
        monthlyPaymentDisplayLbl.setVisible(false);
        dateOfLastPaymentLbl.setVisible(false);
        dateOfLastPaymentDisplayLbl.setVisible(false);
    }

    //make labels visible
    private void addLbls() {
        combinedIncomeLbl.setVisible(true);
        combinedIncomeDisplayLbl.setVisible(true);
        combinedDebtLbl.setVisible(true);
        combinedDebtDisplayLbl.setVisible(true);
        loanPaymentToIncomeRatioLbl.setVisible(true);
        loanPaymentToIncomeRatioDisplayLbl.setVisible(true);
        annualInterestRateLbl.setVisible(true);
        annualInterestRateDisplayLbl.setVisible(true);
        loanAmountLbl.setVisible(true);
        loanAmountDisplayLbl.setVisible(true);
        monthlyPaymentLbl.setVisible(true);
        monthlyPaymentDisplayLbl.setVisible(true);
        dateOfLastPaymentLbl.setVisible(true);
        dateOfLastPaymentDisplayLbl.setVisible(true);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreditScoreCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditScoreCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditScoreCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditScoreCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditScoreCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DD;
    private javax.swing.JLabel annualInterestRateDisplayLbl;
    private javax.swing.JLabel annualInterestRateLbl;
    private javax.swing.JLabel carInfoLbl;
    private javax.swing.JLabel combinedDebtDisplayLbl;
    private javax.swing.JLabel combinedDebtLbl;
    private javax.swing.JLabel combinedIncomeDisplayLbl;
    private javax.swing.JLabel combinedIncomeLbl;
    private javax.swing.JLabel creditScoreCalculatorLbl;
    private javax.swing.JLabel creditScoreLbl;
    private javax.swing.JTextField creditScoreTextField;
    private javax.swing.JLabel customerInfolbl;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel dateOfLastPaymentDisplayLbl;
    private javax.swing.JLabel dateOfLastPaymentLbl;
    private javax.swing.JTextField dayTextField;
    private javax.swing.JLabel debtLbl;
    private javax.swing.JLabel downPaymentLbl;
    private javax.swing.JTextField downPaymentTextField;
    private javax.swing.JLabel incomeLbl;
    private javax.swing.JTextField incomeTextField;
    private javax.swing.JLabel loanAmountDisplayLbl;
    private javax.swing.JLabel loanAmountLbl;
    private javax.swing.JLabel loanPaymentToIncomeRatioDisplayLbl;
    private javax.swing.JLabel loanPaymentToIncomeRatioLbl;
    private javax.swing.JLabel loanTimeLbl;
    private javax.swing.JTextField loanYearsTextField;
    private javax.swing.JTextField monthTextField;
    private javax.swing.JLabel monthlyIncomeLbl;
    private javax.swing.JLabel monthlyPaymentDisplayLbl;
    private javax.swing.JLabel monthlyPaymentInfoLbl;
    private javax.swing.JLabel monthlyPaymentLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel newCarCostLbl;
    private javax.swing.JTextField newCarCostTextField;
    private javax.swing.JTextField paymentTextField;
    private javax.swing.JLabel spouceInfoLbl;
    private javax.swing.JLabel spouseCreditScoreLbl;
    private javax.swing.JTextField spouseCreditScoreTextField;
    private javax.swing.JLabel spouseDebtLbl;
    private javax.swing.JTextField spouseIncomeTextField;
    private javax.swing.JLabel spouseLbl;
    private javax.swing.JTextField spouseMonthlyPaymentTextField;
    private javax.swing.JTextField spouseNameTextField;
    private javax.swing.JLabel spouseNamelbl;
    private javax.swing.JLabel spouseSsnLbl;
    private javax.swing.JTextField spouseSsnTextField;
    private javax.swing.JLabel ssnLbl;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel submitInstructionLbl;
    private javax.swing.JTextField tradeInTextField;
    private javax.swing.JLabel tradeInValueLbl;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
