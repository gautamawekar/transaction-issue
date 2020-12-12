###### Testing with two JPA datasources fails


| micronaut version      | Reproducible |
| ----------- | ----------- |
| 1.3.7   | Yes       |
| 2.2.1   | Yes        |

On version 2.2.1 stack trace
```java
java.lang.IllegalStateException: Transaction synchronization is not active
	at io.micronaut.transaction.support.TransactionSynchronizationManager.getSynchronizations(TransactionSynchronizationManager.java:333)
	at io.micronaut.transaction.support.TransactionSynchronizationUtils.triggerBeforeCompletion(TransactionSynchronizationUtils.java:100)
	at io.micronaut.transaction.support.AbstractSynchronousTransactionManager.triggerBeforeCompletion(AbstractSynchronousTransactionManager.java:1003)
	at io.micronaut.transaction.support.AbstractSynchronousTransactionManager.processCommit(AbstractSynchronousTransactionManager.java:855)
	at io.micronaut.transaction.support.AbstractSynchronousTransactionManager.commit(AbstractSynchronousTransactionManager.java:799)
	at io.micronaut.transaction.test.DefaultTestTransactionExecutionListener.afterTestExecution(DefaultTestTransactionExecutionListener.java:97)
	at io.micronaut.transaction.test.DefaultTestTransactionExecutionListener.afterSetupTest(DefaultTestTransactionExecutionListener.java:67)
	at io.micronaut.test.extensions.AbstractMicronautExtension.fireListeners(AbstractMicronautExtension.java:144)
	at io.micronaut.test.extensions.AbstractMicronautExtension.afterSetupTest(AbstractMicronautExtension.java:117)
	at io.micronaut.test.extensions.spock.MicronautSpockExtension.lambda$visitSpecAnnotation$5(MicronautSpockExtension.java:144)
	at org.spockframework.runtime.extension.MethodInvocation.proceed(MethodInvocation.java:101)
```
