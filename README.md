# appconfiguration-sample

The following sample is meant to highlight the current vulnerabilities found on a starter Java Spring app that uses the Azure SDK App Configuration service. This repo has been set up to follow the instructions defined on this tutorial to configure an app to use the app configuration service.

I have also provided a dec container configuration, so that anybody that anybody with access to Docker and VS Code can re-create an environment to test the application. I have also made it available in GitHub so that anybody that wants to run it as a CodeSpace can use it as it is.

## Instructions
TODO

## Vulnerabilities found
Package                 | Version installed | Version fixed | Artifact type | Vulnerability Id                                                         | Severity
------------------------|-------------------|---------------|---------------|--------------------------------------------------------------------------|---------
maven-wrapper           | 3.1.0             |               | java-archive  | [CVE-2021-26291](https://nvd.nist.gov/vuln/detail/CVE-2021-26291)        | Critical  
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2019-20444](https://nvd.nist.gov/vuln/detail/CVE-2019-20444)        | Critical  
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2019-20445](https://nvd.nist.gov/vuln/detail/CVE-2019-20445)        | Critical  
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2015-2156](https://nvd.nist.gov/vuln/detail/CVE-2015-2156)          | High      
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2019-16869](https://nvd.nist.gov/vuln/detail/CVE-2019-16869)        | High      
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2021-37136](https://nvd.nist.gov/vuln/detail/CVE-2021-37136)        | High      
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2021-37137](https://nvd.nist.gov/vuln/detail/CVE-2021-37137)        | High      
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2014-3488](https://nvd.nist.gov/vuln/detail/CVE-2014-3488)          | Medium    
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2021-21290](https://nvd.nist.gov/vuln/detail/CVE-2021-21290)        | Medium    
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2021-21295](https://nvd.nist.gov/vuln/detail/CVE-2021-21295)        | Medium    
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2021-21409](https://nvd.nist.gov/vuln/detail/CVE-2021-21409)        | Medium    
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2022-24823](https://nvd.nist.gov/vuln/detail/CVE-2022-24823)        | Medium    
reactor-netty-core      | 1.0.24            |               | java-archive  | [CVE-2021-43797](https://nvd.nist.gov/vuln/detail/CVE-2021-43797)        | Medium    
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2019-20444](https://nvd.nist.gov/vuln/detail/CVE-2019-20444)        | Critical  
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2019-20445](https://nvd.nist.gov/vuln/detail/CVE-2019-20445)        | Critical  
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2015-2156](https://nvd.nist.gov/vuln/detail/CVE-2015-2156)          | High      
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2019-16869](https://nvd.nist.gov/vuln/detail/CVE-2019-16869)        | High      
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2021-37136](https://nvd.nist.gov/vuln/detail/CVE-2021-37136)        | High      
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2021-37137](https://nvd.nist.gov/vuln/detail/CVE-2021-37137)        | High      
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2014-3488](https://nvd.nist.gov/vuln/detail/CVE-2014-3488)          | Medium    
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2021-21290](https://nvd.nist.gov/vuln/detail/CVE-2021-21290)        | Medium    
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2021-21295](https://nvd.nist.gov/vuln/detail/CVE-2021-21295)        | Medium    
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2021-21409](https://nvd.nist.gov/vuln/detail/CVE-2021-21409)        | Medium    
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2022-24823](https://nvd.nist.gov/vuln/detail/CVE-2022-24823)        | Medium    
reactor-netty-http      | 1.0.24            |               | java-archive  | [CVE-2021-43797](https://nvd.nist.gov/vuln/detail/CVE-2021-43797)        | Medium    
snakeyaml               | 1.30              | 1.31          | java-archive  | [GHSA-3mc7-4q67-w48m](https://github.com/advisories/GHSA-3mc7-4q67-w48m) |  High      
snakeyaml               | 1.30              | 1.32          | java-archive  | [GHSA-9w3m-gqgf-c4p9](https://github.com/advisories/GHSA-9w3m-gqgf-c4p9) |  Medium    
snakeyaml               | 1.30              | 1.31          | java-archive  | [GHSA-98wm-3w3q-mw94](https://github.com/advisories/98wm-3w3q-mw94)      |  Medium    
snakeyaml               | 1.30              | 1.31          | java-archive  | [GHSA-c4r9-r8fh-9vj2](https://github.com/advisories/GHSA-c4r9-r8fh-9vj2) |  Medium    
snakeyaml               | 1.30              | 1.31          | java-archive  | [GHSA-hhhw-99gj-p3c3](https://github.com/advisories/GHSA-hhhw-99gj-p3c3) |  Medium    
spring-boot-starter-web |                   | 2.5.12        | java-archive  | [GHSA-36p3-wjmg-h94x](https://github.com/advisories/GHSA-36p3-wjmg-h94x) |  Critical  
spring-core             | 5.3.23            |               | java-archive  | [CVE-2016-1000027](https://nvd.nist.gov/vuln/detail/CVE-2016-1000027)    |  Critical  
woodstox-core           | 6.3.1             | 6.4.0         | java-archive  | [GHSA-fv22-xp26-mm9w](https://github.com/advisories/GHSA-fv22-xp26-mm9w) |  High      
woodstox-core           | 6.3.1             | 6.4.0         | java-archive  | [GHSA-9fwf-46g9-45rx](https://github.com/advisories/GHSA-9fwf-46g9-45rx) |  Low       
woodstox-core           | 6.3.1             | 6.4.0         | java-archive  | [GHSA-5hc5-c3m9-8vcj](https://github.com/advisories/GHSA-5hc5-c3m9-8vcj) |  Low       
woodstox-core           | 6.3.1             | 6.4.0         | java-archive  | [GHSA-4rv7-wj6m-6c6r](https://github.com/advisories/GHSA-4rv7-wj6m-6c6r) |  Low       
woodstox-core           | 6.3.1             | 6.4.0         | java-archive  | [GHSA-3f7h-mf4q-vrm4](https://github.com/advisories/GHSA-3f7h-mf4q-vrm4) |  Low
