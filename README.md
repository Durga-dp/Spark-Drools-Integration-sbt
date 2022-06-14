took this source from https://github.com/saikrishnapujari/Spark-Drools-Integration
and converted from maven to sbt project.
No other changes made.

It is compiling successfully and able to run SparkDroolsIntTest through IntelliJ IDE.

as of 6/14/2022, Getting following output and exception when running SparkDroolsIntTest 

Output:
+---+-------------+-------------+
|cid|traffic_light|driving_style|
+---+-------------+-------------+
|  0|       yellow|        crazy|
|  0|        green|        crazy|
|  0|          red|        crazy|
|  1|       yellow|         sane|
|  1|        green|         sane|
|  1|          red|         sane|
+---+-------------+-------------+

StructType(StructField(cid,StringType,true), StructField(traffic_light,StringType,true), StructField(driving_style,StringType,true))
---------------------------------------


Caused by: java.lang.NullPointerException
at org.drools.compiler.rule.builder.RuleBuilder.build(RuleBuilder.java:103)
at org.drools.compiler.builder.impl.KnowledgeBuilderImpl.internalAddRule(KnowledgeBuilderImpl.java:1161)
at org.drools.compiler.builder.impl.KnowledgeBuilderImpl.addRule(KnowledgeBuilderImpl.java:1156)
at org.drools.compiler.builder.impl.KnowledgeBuilderImpl.compileRulesLevel(KnowledgeBuilderImpl.java:1134)
at org.drools.compiler.builder.impl.KnowledgeBuilderImpl.compileRules(KnowledgeBuilderImpl.java:1082)
at org.drools.compiler.builder.impl.KnowledgeBuilderImpl.compileKnowledgePackages(KnowledgeBuilderImpl.java:900)
at org.drools.compiler.builder.impl.KnowledgeBuilderImpl.addPackage(KnowledgeBuilderImpl.java:891)
at org.drools.compiler.builder.impl.KnowledgeBuilderImpl.addPackageFromDrl(KnowledgeBuilderImpl.java:544)
at org.drools.compiler.builder.impl.KnowledgeBuilderImpl.addKnowledgeResource(KnowledgeBuilderImpl.java:710)
at org.drools.compiler.builder.impl.KnowledgeBuilderImpl.add(KnowledgeBuilderImpl.java:2183)
at org.drools.compiler.builder.impl.KnowledgeBuilderImpl.add(KnowledgeBuilderImpl.java:2172)
at TrafficRulesTest.<init>(TrafficRulesTest.scala:16)
at SparkDroolsIntTest$.$anonfun$testFun$1(SparkDroolsIntTest.scala:25)