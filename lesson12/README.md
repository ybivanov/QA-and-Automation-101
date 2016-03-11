# How to find 1000 bugs in 30 minutes

In every sufficiently large software system there are changes which affect
multiple components. If the system is big enough then we end up with 100s
and even 1000s of bugs when the change is not well designed or well executed.

To find these bugs you need to look for patterns and apply your search on a
massive scale.

### Exercise: (30 minutes)

* Work in groups
* Read the following list of articles and bug reports and discuss them
* Instructor will also explain them to the class if unclear

#### RHBZ #350481 - private bug, details follow:

    rpm doesn't perform a conflict check for /usr/share/doc.
    
     Customer installed both packages
     gdbm-1.8.0-24.x86_64
     gdbm-1.8.0-24.i386
    
     When one package is being deinstalled the documentation is deleted.
    
    It is possible to install the same package in both the i386 (32-bit) in
    the x86_64 (64-bit) versions on the x86_64 architecture. However, there
    are some complications in certain cases. The Red Hat Magazine article at
    http://www.redhat.com/magazine/009jul05/features/multilib/ explains some
    of those.
    
    The case described by the customer is effectively a problem with the
    current implementation. This problem does apply to both %doc and %lang
    sections in the RPM spec files. That is, upon removal of the 32-bit version,
    the 64-bit version would lose the documentation and translation files
    installed for specific languages.

Incorrect fix for the above bug resulted in the following bugs:
* https://bugzilla.redhat.com/show_bug.cgi?id=448905
* https://bugzilla.redhat.com/show_bug.cgi?id=448906
* https://bugzilla.redhat.com/show_bug.cgi?id=448907
* https://bugzilla.redhat.com/show_bug.cgi?id=448909
* https://bugzilla.redhat.com/show_bug.cgi?id=448910
* https://bugzilla.redhat.com/show_bug.cgi?id=448911

Solution, ignore conflicts under `/usr/share/doc`.

#### Empty or missing -debuginfo packages (30 bugs)

Search for -debuginfo at http://red.ht/1QSLiC3

#### Errors when installing packages with --excludedocs (100 bugs)

Search for `--excludedocs` at http://red.ht/1QSLiC3

#### File conflicts between multilib -devel packages

25 bugs and potentially 50000 conflicting files, see
https://bugzilla.redhat.com/show_bug.cgi?id=644778


#### rpmlint errors and warnings (15 bugs)

Search for "rpmlint errors" at http://red.ht/1QSLiC3


#### Installing packages with --instLangs leaves empty directories under
`/usr/share/locale`

These are owned by the `filesystem` RPM. In case of building
Docker images these directories are useless. This may affect every single RPM
which ships translation files (.spec changes), depending on chosen fix. See
* http://atodorov.org/blog/2015/10/28/building-docker-images-with-anaconda/

#### Missing or non executed tests (2000 packages)

http://atodorov.org/blog/2014/02/28/action-improving-test-coverage-in-fedora/

#### Possible checksec errors (4000+ offenses)

http://atodorov.org/blog/2015/09/16/4000-bugs-in-fedora-checksec-failures/

#### Documentation proof-reading, spell check, URLs check

See *How we found a million style and grammar errors in the English Wikipedia*
https://archive.fosdem.org/2014/schedule/event/how_we_found_600000_grammar_errors/

#### Add repo URLs to package.json (250+ issues)

See:
https://github.com/pulls?page=1&q=is%3Apr+author%3AForbesLindesay+package.json&utf8=%E2%9C%93

These are automatically found and even automatically fixed (using the GitHub API)!


### Exercise: (150 minutes)

* Work in groups
* Look at the Fedora 24 change set at
https://fedoraproject.org/wiki/Releases/24/ChangeSet
* Design an exploration strategy to find multiple bugs of the same origin
* NOTE: if you are resourceful you can also think about other methods to try,
not only looking at the proposed changes.

* Write down your strategy and discuss it with the class and/or instructor
* Write an automated test script (Python or Bash may be most appropriate)
to execute your strategy. Log the results and append them in this GitHub repo.

**NOTE:** Please don't file bugs in Bugzilla automatically. Developers absolutely
hate that and many of the perceived bugs will be false negatives! Discuss your
findings with the class instead. If the results seem to be legitimate bugs
you can start by posting your concerns on fedora-devel and fedora-test mailing
lists!
