package myApp;

import tech.tablesaw.api.*;
import tech.tablesaw.columns.*;
import tech.tablesaw.io.*;
import tech.tablesaw.io.csv.*;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.HistogramTrace;

import java.io.*;

/**
 * Example of using the tablesaw library to create a chart
 * https://jtablesaw.github.io/tablesaw
 */

public class Bars {
  public static void main( String[] args ) throws FileNotFoundException, java.io.IOException  {

    CsvReadOptions.Builder builder =
      CsvReadOptions.builder("output.txt").separator(':').header(false);

    CsvReadOptions options = builder.build();
    Table myTable = Table.read().usingOptions(options);

    // System.out.println(myTable.print());

    System.out.println(myTable.columnNames());

    Layout layout = Layout.builder().title("title of chart").build();
    HistogramTrace trace = HistogramTrace.builder(myTable.nCol("C0")).build();

    Plot.show(new Figure(layout, trace));

  }
}
