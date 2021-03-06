# Changelog

* All notable changes prior to 1.10 are documented in this changelog.
* Release notes for versions >=1.10 can be found on the [GitHub release page](https://github.com/jenkinsci/timestamper-plugin/releases).

### Release History

New releases may take a few hours to appear in the update center.

#### 1.10 and newer

See the [GitHub release page](https://github.com/jenkinsci/timestamper-plugin/releases).

#### 1.9 (2019-02-07)

-   Redesign of integration with Pipeline: timestamps are now written in plain text into the build log, and displayed specially if and when viewed in the classic UI. Also the `timestamps` step/option may be omitted in favor of a global option. Solves  [![](https://issues.jenkins-ci.org/secure/viewavatar?size=xsmall&avatarId=14673&avatarType=issuetype)JENKINS-48344](https://issues.jenkins-ci.org/browse/JENKINS-48344) - Log files generated by Jenkins pipeline scripts are bloated RESOLVED ,  [![](https://issues.jenkins-ci.org/secure/viewavatar?size=xsmall&avatarId=14673&avatarType=issuetype)JENKINS-54081](https://issues.jenkins-ci.org/browse/JENKINS-54081) - Timestamps missing for agent-based steps in Pipeline Job 2.26 RESOLVED , and (for pre-2.161 Jenkins versions)  [![](https://issues.jenkins-ci.org/secure/viewavatar?size=xsmall&avatarId=14673&avatarType=issuetype)JENKINS-55257](https://issues.jenkins-ci.org/browse/JENKINS-55257) - Timestamper break builds on Windows agents RESOLVED .

#### 1.8.10 (May 9, 2018)

-   Add a forward slash to the URLs opened when clicking "View as plain text". For some web servers, this is necessary to open the correct page. ([JENKINS-50713](https://issues.jenkins-ci.org/browse/JENKINS-50713))
-   Hide the "View as plain text" link when viewing a pipeline step because it isn't applicable to this page. ([JENKINS-47051](https://issues.jenkins-ci.org/browse/JENKINS-47051))
-   Fix the display of timestamps at the `/timestamps/` URL for pipeline builds when not using the `appendLog` flag. ([JENKINS-51106](https://issues.jenkins-ci.org/browse/JENKINS-51106))
-   Use the browser's time zone by default. This only takes affect for new users or after clearing the cookies. ([pull request #22](https://github.com/jenkinsci/timestamper-plugin/pull/22))\
    Contributed by Wilfred Hughes

#### 1.8.9 (Dec 17, 2017)

-   Remove extra lines from `/timestamps/` URL output when log file contains carriage return characters. ([JENKINS-46420](https://issues.jenkins-ci.org/browse/JENKINS-46420)) ([pull request #21](https://github.com/jenkinsci/timestamper-plugin/pull/21))\
    Contributed by Darragh Bailey

#### 1.8.8 (Jan 22, 2017)

-   Improve performance when generating logs for a pipeline build. ([JENKINS-40762](https://issues.jenkins-ci.org/browse/JENKINS-40762)) ([pull request #20](https://github.com/jenkinsci/timestamper-plugin/pull/20))\
    Contributed by Edwin Flores
-   Can now retrieve the current time from the `/timestamps/` URL. ([JENKINS-21687](https://issues.jenkins-ci.org/browse/JENKINS-21687))

#### 1.8.7 (Oct 05, 2016)

-   Reverted changes made under [JENKINS-34019](https://issues.jenkins-ci.org/browse/JENKINS-34019) because they clash with custom Jenkins themes. ([JENKINS-38390](https://issues.jenkins-ci.org/browse/JENKINS-38390))

#### 1.8.6 (Sep 19, 2016)

-   The timestamps are no longer affected by styles applied by the AnsiColor plugin. ([JENKINS-34019](https://issues.jenkins-ci.org/browse/JENKINS-34019)) (reverted in next release 1.8.7)
-   Console page settings were not appearing for some users. ([JENKINS-38085](https://issues.jenkins-ci.org/browse/JENKINS-38085))
-   Prevent unnecessary warning messages from being logged with Timestamper 1.8.5 installed. ([JENKINS-38098](https://issues.jenkins-ci.org/browse/JENKINS-38098))

#### 1.8.5 (Aug 31, 2016)

-   Performance: Read from end of log file for finished build ([pull request #18](https://github.com/jenkinsci/timestamper-plugin/pull/18))\
    Contributed by Akbashev Alexander
-   Improve error reporting when invalid parameters are passed to the `/timestamps` URL.
-   Requires Java 7 or later.

#### 1.8.4 (Jun 26, 2016)

-   When reading the log file, handle escape characters that do not form part of a console note. ([JENKINS-36103](https://issues.jenkins-ci.org/browse/JENKINS-36103))

#### 1.8.3 (Jun 12, 2016)

-   Allow running behind an HTTPS proxy. ([JENKINS-35315](https://issues.jenkins-ci.org/browse/JENKINS-35315))
-   Prevent warning messages when workflow-step-api is not installed. ([JENKINS-35375](https://issues.jenkins-ci.org/browse/JENKINS-35375))

#### 1.8.2 (May 15, 2016)

-   Make the workflow-step-api dependency optional.

#### 1.8.1 (May 15, 2016)

-   Custom [pipeline step](https://wiki.jenkins-ci.org/display/JENKINS/Pipeline+Plugin) for recording timestamps. ([JENKINS-30142](https://issues.jenkins-ci.org/browse/JENKINS-30142))
-   Display a link to the raw console output including timestamps. ([JENKINS-26794](https://issues.jenkins-ci.org/browse/JENKINS-26794))
-   New query parameters recognised by the `/timestamps/` URL: time, elapsed, appendLog, startLine, endLine, timeZone, locale.
-   Java API for retrieving timestamps from other plugins. ([JENKINS-21213](https://issues.jenkins-ci.org/browse/JENKINS-21213))
-   The elapsed time is measured from the actual build start time, rather than the scheduled start time.

#### 1.8 (May 15, 2016)

#### 1.7.4 (Jan 31, 2016)

-   Display timestamps for individual [pipeline build](https://wiki.jenkins-ci.org/display/JENKINS/Pipeline+Plugin) steps. ([JENKINS-30143](https://issues.jenkins-ci.org/browse/JENKINS-30143))

#### 1.7.3 (Jan 13, 2016)

-   Persist the chosen timestamp display settings. This was broken since 1.7.2. ([JENKINS-32074](https://issues.jenkins-ci.org/browse/JENKINS-32074))

#### 1.7.2 (Aug 15, 2015)

-   Change cookie path from '/' to the root URL of Jenkins ([JENKINS-29899](https://issues.jenkins-ci.org/browse/JENKINS-29899))\
    Contributed by Kiyoshi Ohgishi

#### 1.7.1 (Jul 11, 2015)

-   Display the console page settings within the side panel with the other actions. ([JENKINS-28948](https://issues.jenkins-ci.org/browse/JENKINS-28948))
-   Support for newer Jenkins to display the settings in the console page. ([JENKINS-29361](https://issues.jenkins-ci.org/browse/JENKINS-29361))

#### 1.7 (Jun 24, 2015)

-   Timestamps now appear during [pipeline builds](https://wiki.jenkins-ci.org/display/JENKINS/Pipeline+Plugin). ([pull request #13](https://github.com/jenkinsci/timestamper-plugin/pull/13))\
    Contributed by Jesse Glick
-   Requires Jenkins 1.608.

#### 1.6.2 (May 31, 2015)

-   Retain the selection to use the browser's time zone when not using "system" time. ([pull request #14](https://github.com/jenkinsci/timestamper-plugin/pull/14)) ([pull request #15](https://github.com/jenkinsci/timestamper-plugin/pull/15))\
    Contributed by Sebastian Schuberth

#### 1.6.1 (May 27, 2015)

#### 1.6 (Mar 11, 2015)

-   Add an option to use the browser's time zone. ([pull request #11](https://github.com/jenkinsci/timestamper-plugin/pull/11))\
    Contributed by michael1010
-   Japanese translations. ([pull request #12](https://github.com/jenkinsci/timestamper-plugin/pull/12))\
    Contributed by Pei-Tang Huang

#### 1.5.16 (Feb 25, 2015)

-   Allow clicking on the text labels next to the radio buttons. ([JENKINS-27054](https://issues.jenkins-ci.org/browse/JENKINS-27054))\
    Contributed by Paul Fee

#### 1.5.15 (Dec 24, 2014)

-   Fix encoding problem with the German translation of the plugin description. ([JENKINS-26206](https://issues.jenkins-ci.org/browse/JENKINS-26206))

#### 1.5.14 (Jul 30, 2014)

-   Reduce size of the X-ConsoleAnnotator HTTP header. ([JENKINS-23867](https://issues.jenkins-ci.org/browse/JENKINS-23867))\
    The header size may have caused problems depending on how your web container is configured.

#### 1.5.13 (Jul 23, 2014)

-   Fix incompatibility with Jenkins 1.572 or later. ([JENKINS-23867](https://issues.jenkins-ci.org/browse/JENKINS-23867)) ([JENKINS-23943](https://issues.jenkins-ci.org/browse/JENKINS-23943)) ([pull request #9](https://github.com/jenkinsci/timestamper-plugin/pull/9))\
    Contributed by Geoff Cummings

#### 1.5.12 (Jun 07, 2014)

-   Allow the time zone for the timestamps to be configured. ([JENKINS-22586](https://issues.jenkins-ci.org/browse/JENKINS-22586))

#### 1.5.11 (Apr 09, 2014)

-   Further German translations. ([pull request #8](https://github.com/jenkinsci/timestamper-plugin/pull/8))\
    Contributed by phoenix384

#### 1.5.10 (Apr 09, 2014)

#### 1.5.9 (Mar 10, 2014)

-   German translations. ([pull request #6](https://github.com/jenkinsci/timestamper-plugin/pull/6)) ([pull request #7](https://github.com/jenkinsci/timestamper-plugin/pull/7))\
    Contributed by phoenix384
-   Declare the licence in the POM file. ([pull request #5](https://github.com/jenkinsci/timestamper-plugin/pull/5))\
    Contributed by Tom Van Eyck

#### 1.5.8 (Jan 02, 2014)

-   Implemented a work-around for servers that do not reliably report the elapsed time. ([JENKINS-19778](https://issues.jenkins-ci.org/browse/JENKINS-19778))
-   Support for gzipped build logs.
-   Requires Java 6 or later.
-   Requires Jenkins 1.520.

#### 1.5.7 (Aug 21, 2013)

-   Fix minor incompatibility with Publish Over SSH Plugin. ([JENKINS-19193](https://issues.jenkins-ci.org/browse/JENKINS-19193))

#### 1.5.6 (Jul 25, 2013)

-   Update the DurationFormatUtils URL in the help messages. ([pull request #4](https://github.com/jenkinsci/timestamper-plugin/pull/4))\
    Contributed by Bananeweizen

#### 1.5.5 (Jul 24, 2013)

-   Display timestamps correctly when viewing the truncated console log. ([JENKINS-17779](https://issues.jenkins-ci.org/browse/JENKINS-17779))\
    Contributed by Kohsuke Kawaguchi

#### 1.5.4 (Jun 04, 2013)

-   Prevent another NPE being thrown when the slave is taken offline during a build. ([JENKINS-16778](https://issues.jenkins-ci.org/browse/JENKINS-16778)) ([pull request #3](https://github.com/jenkinsci/timestamper-plugin/pull/3))\
    Contributed by jdewinne

#### 1.5.3 (Mar 17, 2013)

-   Traditional Chinese translations. ([pull request #2](https://github.com/jenkinsci/timestamper-plugin/pull/2))\
    Contributed by Pei-Tang Huang
-   Workaround a bug in Jenkins which causes a VM crash. ([JENKINS-16528](https://issues.jenkins-ci.org/browse/JENKINS-16528))
-   Prevent an NPE being thrown when the slave is taken offline during a build. ([JENKINS-16778](https://issues.jenkins-ci.org/browse/JENKINS-16778))

#### 1.5.2 (Feb 03, 2013)

-   Support for Internet Explorer 8. ([JENKINS-16598](https://issues.jenkins-ci.org/browse/JENKINS-16598))

#### 1.5.1 (Jan 22, 2013)

-   Prevent NPE when the servlet mapping is "/". ([JENKINS-16438](https://issues.jenkins-ci.org/browse/JENKINS-16438))

#### 1.5 (Jan 05, 2013)

-   Can choose to display either the system clock time, the elapsed time since the build started, or no timestamps at all. ([JENKINS-14931](https://issues.jenkins-ci.org/browse/JENKINS-14931))
-   The elapsed time format can be configured.

#### 1.4 (Dec 27, 2012)

-   The timestamp data now requires less disk space and does not clutter the build log file. ([JENKINS-14932](https://issues.jenkins-ci.org/browse/JENKINS-14932))\
    Upgrade warning:\
    If you use a script to read the timestamp data directly from the build log file, you will need to either:\
    (a) Modify the script to read from the `/timestamps` URL instead (recommended) OR\
    (b) Provide the `-Dtimestamper-consolenotes=true` VM argument when starting Jenkins to use the old format.

#### 1.3.2 (Sep 30, 2012)

-   Scripts can read timestamps from the `/timestamps` URL of each build.
-   Requires Jenkins 1.461.

#### 1.3.1 (Sep 08, 2012)

-   Can configure an empty timestamp format.

#### 1.3 (Aug 26, 2012)

-   The timestamp format is configurable. ([pull request #1](https://github.com/jenkinsci/timestamper-plugin/pull/1))\
    Contributed by Frederik Fromm
-   Requires Jenkins 1.450.

#### 1.2.2 (Feb 07, 2011)

-   Built from github repository with new Jenkins infrastructure. No behavioural changes.

#### 1.2.1 (Sep 07, 2010)

-   Timestamps no longer interfere with the Ant target highlighting.

#### 1.2 (Aug 29, 2010)

-   More robust implementation; prevents errors that could arise for some build configurations. ([JENKINS-7112](https://issues.jenkins-ci.org/browse/JENKINS-7112))
-   Requires Jenkins 1.374.

#### 1.1 (Aug 01, 2010)

-   Fix incompatibility with Mercurial Plugin. ([JENKINS-7111](https://issues.jenkins-ci.org/browse/JENKINS-7111))

#### 1.0 (Jul 31, 2010)

-   Initial release.
-   Requires Jenkins 1.349.
