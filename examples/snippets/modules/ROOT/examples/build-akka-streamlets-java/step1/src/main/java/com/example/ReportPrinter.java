package com.example;

import akka.NotUsed;
import akka.stream.*;
import akka.stream.javadsl.*;

import cloudflow.streamlets.*;
import cloudflow.streamlets.avro.*;
import cloudflow.akkastream.*;
import cloudflow.akkastream.javadsl.*;

public class ReportPrinter extends AkkaStreamlet {
  // 1. Create inlets and outlets
  AvroInlet<Report> inlet = AvroInlet.<Report>create("report-in", Report.class);

  // 2. TODO Define the shape of the streamlet
  public StreamletShape shape() { throw new UnsupportedOperationException("Not Implemented"); }
  // 3. TODO Override createLogic to provide StreamletLogic
  public RunnableGraphStreamletLogic createLogic() { throw new UnsupportedOperationException("Not Implemented"); }
}