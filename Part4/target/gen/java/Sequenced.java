/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Sequenced extends ASTRAClass {
	public Sequenced() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Sequenced", new int[] {22,11,22,21},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"Sequenced", new int[] {22,20,30,7},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "L"),
						"Sequenced", new int[] {23,10,30,7},
						new ListTerm(new Term[] {
							Primitive.newPrimitive("1"),
							Primitive.newPrimitive("1"),
							Primitive.newPrimitive("2"),
							Primitive.newPrimitive("1")
						})
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"Sequenced", new int[] {25,10,30,7},
						Primitive.newPrimitive(0)
					),
					new While(
						"Sequenced", new int[] {26,10,30,7},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							new ModuleTerm("prelude", Type.INTEGER,
								new Predicate("size", new Term[] {
									new Variable(Type.LIST, "L")
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Prelude) intention.getModule("Sequenced","prelude")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("Sequenced","prelude")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							)
						),
						new Block(
							"Sequenced", new int[] {26,38,29,11},
							new Statement[] {
								new Subgoal(
									"Sequenced", new int[] {27,14,29,11},
									new Goal(
										new Predicate("flip", new Term[] {
											new ModuleTerm("prelude", Type.STRING,
												new Predicate("valueAsString", new Term[] {
													new Variable(Type.LIST, "L"),
													new Variable(Type.INTEGER, "i")
												}),
												new ModuleTermAdaptor() {
													public Object invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.Prelude) intention.getModule("Sequenced","prelude")).valueAsString(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
															(int) intention.evaluate(predicate.getTerm(1))
														);
													}
													public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
														return ((astra.lang.Prelude) visitor.agent().getModule("Sequenced","prelude")).valueAsString(
															(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
															(int) visitor.evaluate(predicate.getTerm(1))
														);
													}
												}
											)
										})
									)
								),
								new Assignment(
									new Variable(Type.INTEGER, "i"),
									"Sequenced", new int[] {28,14,29,11},
									Operator.newOperator('+',
										new Variable(Type.INTEGER, "i"),
										Primitive.newPrimitive(1)
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Sequenced", new int[] {36,9,36,60},
			new GoalEvent('+',
				new Goal(
					new Predicate("flip", new Term[] {
						new Variable(Type.STRING, "A",false)
					})
				)
			),
			new Predicate("transition", new Term[] {
				new Variable(Type.STRING, "S",false),
				new Variable(Type.STRING, "T",false)
			}),
			new Block(
				"Sequenced", new int[] {36,59,40,5},
				new Statement[] {
					new ModuleCall("console",
						"Sequenced", new int[] {37,9,37,65},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Switch "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "A"),
									Operator.newOperator('+',
										Primitive.newPrimitive("flip"),
										Operator.newOperator('+',
											new Variable(Type.STRING, "T"),
											Primitive.newPrimitive(" switch ")
										)
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Sequenced","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Sequenced", new int[] {38,8,40,5},
						new Predicate("switch", new Term[] {
							new Variable(Type.STRING, "A"),
							new Variable(Type.STRING, "S")
						})
					),
					new BeliefUpdate('+',
						"Sequenced", new int[] {39,8,40,5},
						new Predicate("switch", new Term[] {
							new Variable(Type.STRING, "A"),
							new Variable(Type.STRING, "T")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Sequenced", new int[] {43,9,43,38},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "A",false),
					new Variable(Type.STRING, "S",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Sequenced", new int[] {43,37,46,5},
				new Statement[] {
					new ModuleCall("console",
						"Sequenced", new int[] {44,8,44,74},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("2. Set Goal light  "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "A"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" to state "),
										Operator.newOperator('+',
											new Variable(Type.STRING, "S"),
											Primitive.newPrimitive(" ")
										)
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Sequenced","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Sequenced", new int[] {45,8,46,5},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "A"),
								new Variable(Type.STRING, "S")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Sequenced", new int[] {49,9,49,52},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "A",false),
						new Variable(Type.STRING, "S",false)
					})
				)
			),
			new Predicate("light", new Term[] {
				new Variable(Type.STRING, "A"),
				new Variable(Type.STRING, "S")
			}),
			new Block(
				"Sequenced", new int[] {49,51,51,5},
				new Statement[] {
					new ModuleCall("console",
						"Sequenced", new int[] {50,8,50,108},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "A"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" already correct in state '"),
										Operator.newOperator('+',
											new Variable(Type.STRING, "S"),
											Primitive.newPrimitive("' matching switch, do nothing ")
										)
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Sequenced","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Sequenced", new int[] {54,9,54,78},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "A",false),
						new Variable(Type.STRING, "S",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "A"),
						new Variable(Type.STRING, "S")
					})
				),
				new Predicate("transition", new Term[] {
					new Variable(Type.STRING, "T",false),
					new Variable(Type.STRING, "S")
				})
			),
			new Block(
				"Sequenced", new int[] {54,77,65,5},
				new Statement[] {
					new ModuleCall("console",
						"Sequenced", new int[] {56,8,56,100},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "A"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" in wrong state "),
										Operator.newOperator('+',
											new Variable(Type.STRING, "T"),
											Operator.newOperator('+',
												Primitive.newPrimitive(" fix the light by changing to "),
												new Variable(Type.STRING, "S")
											)
										)
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Sequenced","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Sequenced", new int[] {58,8,65,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "A"),
							new Variable(Type.STRING, "T")
						})
					),
					new BeliefUpdate('+',
						"Sequenced", new int[] {59,8,65,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "A"),
							new Variable(Type.STRING, "S")
						})
					),
					new ModuleCall("console",
						"Sequenced", new int[] {60,8,60,77},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("call "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "A"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" light to change to "),
										Operator.newOperator('+',
											new Variable(Type.STRING, "S"),
											Primitive.newPrimitive("  again... ")
										)
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Sequenced","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("system",
						"Sequenced", new int[] {61,8,61,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(2000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Sequenced","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Sequenced", new int[] {63,8,65,5},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "A"),
								new Variable(Type.STRING, "S")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Sequenced", new int[] {67,9,67,38},
			new BeliefEvent('+',
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "L",false),
					new Variable(Type.STRING, "L2",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Sequenced", new int[] {67,37,69,5},
				new Statement[] {
					new ModuleCall("console",
						"Sequenced", new int[] {68,8,68,63},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "L"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" is in state: "),
										new Variable(Type.STRING, "L2")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Sequenced","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Sequenced", new int[] {71,9,71,26},
			new BeliefEvent('+',
				new Predicate("flip", new Term[] {
					new Variable(Type.STRING, "A",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Sequenced", new int[] {71,25,74,5},
				new Statement[] {
					new ModuleCall("console",
						"Sequenced", new int[] {72,8,72,56},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Switch: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "A"),
									Primitive.newPrimitive(" flipped: ")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Sequenced","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("d",
						"Sequenced", new int[] {73,8,73,23},
						new Predicate("dumpBeliefs", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Debug) intention.getModule("Sequenced","d")).dumpBeliefs(
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("1"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("2"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("1"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("2"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("off"),
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Goal(
				new Predicate("init", new Term[] {})
			)
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
		fragment.addModule("prelude",astra.lang.Prelude.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
		fragment.addModule("d",astra.lang.Debug.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Sequenced().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
