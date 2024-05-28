# Spoofax 3 Dependency Management
[![Build][github-build-badge]][github-build]
[![License][license-badge]][license]
[![GitHub Release][github-release-badge]][github-release]

This repository contains the two projects for managing Spoofax 3 dependencies.

| Artifact                          | Latest Release                                                                |
| --------------------------------- | ----------------------------------------------------------------------------- |
| `org.metaborg.spoofax3:platform`  | [![org.metaborg.spoofax3:platform][platform-maven-badge]][platform-maven]     |
| `org.metaborg.spoofax3:catalog`   | [![org.metaborg.spoofax3:catalog][catalog-maven-badge]][catalog-maven]        |



## Platform
The `org.metaborg.spoofax3:platform` package is meant to be used by consumers of Spoofax 3 dependencies. The platform aligns Spoofax 3 dependencies that work together.


## Catalog
The `org.metaborg.spoofax3:catalog` package is meant to be used internally within Spoofax 3 projects, to align the versions of the third-party dependencies that are used.


## License
Copyright 2024 Delft University of Technology

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at <https://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an **"as is" basis, without warranties or conditions of any kind**, either express or implied. See the License for the specific language governing permissions and limitations under the License.



[github-build-badge]: https://img.shields.io/github/actions/workflow/status/metaborg/spoofax3-depman/build.yaml
[github-build]: https://github.com/metaborg/spoofax3-depman/actions
[license-badge]: https://img.shields.io/github/license/metaborg/spoofax3-depman
[license]: https://github.com/metaborg/spoofax3-depman/blob/main/LICENSE
[github-release-badge]: https://img.shields.io/github/v/release/metaborg/spoofax3-depman
[github-release]: https://github.com/metaborg/spoofax3-depman/releases

[platform-maven-badge]: https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Fartifacts.metaborg.org%2Fservice%2Flocal%2Frepositories%2Freleases%2Fcontent%2Forg%2Fmetaborg%2Fspoofax3%2Fplatform%2Fmaven-metadata.xml
[platform-maven]: https://artifacts.metaborg.org/#nexus-search;gav~org.metaborg.spoofax3~platform~~~

[catalog-maven-badge]: https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Fartifacts.metaborg.org%2Fservice%2Flocal%2Frepositories%2Freleases%2Fcontent%2Forg%2Fmetaborg%2Fspoofax3%2Fcatalog%2Fmaven-metadata.xml
[catalog-maven]: https://artifacts.metaborg.org/#nexus-search;gav~org.metaborg.spoofax3~catalog~~~